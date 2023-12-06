package pl.polsl.lab.controller;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import jakarta.annotation.PostConstruct;
import java.io.FileReader;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Controller;
import pl.polsl.lab.Main;
import pl.polsl.lab.model.Planet;
import pl.polsl.lab.model.PlanetService;

/**
 * @author Martyna Szczekocka
 * @version 1.0
 */
@Controller
@RequiredArgsConstructor
public class PlanetFileController {

    private final PlanetService planetService;
    
    @PostConstruct()
    @DependsOn("planetService")
    public void initFileLoading() {
        loadFile();
    }

    
    public void loadFile() {
        String filePath =  Main.class.getClassLoader().getResource("planets.csv").getPath();
        
        try (FileReader reader = new FileReader(filePath)) {
            CsvToBean<Planet> csvToBean = new CsvToBeanBuilder<Planet>(reader)
                    .withSkipLines(1)
                    .withType(Planet.class)
                    .build();

            List<Planet> planets = csvToBean.parse();
            planetService.saveAllPlanets(planets);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
