package pl.polsl.lab.model;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Martyna Szczekocka
 * @version 1.0
 */
@Service
@RequiredArgsConstructor
public class PlanetService {
    private final PlanetRepository planetRepository;
    
    public List<Planet> findAllPlanets() {
        return planetRepository.findAll();
    }
    
    public Planet findPlanetById(int id) {
        Optional<Planet> planet = planetRepository.findById(id);
        return planet.orElseThrow(() -> new RuntimeException("Value is not present"));
    }
    
    public List<Planet> findAllPlanetsSortByMassAsc(){
        List<Planet> allPlanets = planetRepository.findAll();
        allPlanets.sort(Comparator.comparing(Planet::getMass));
        return allPlanets;
    }
    
    public List<Planet> saveAllPlanets(List<Planet> planets) {
        return planetRepository.saveAll(planets);
    }
    
    
    
    
    
    
}
