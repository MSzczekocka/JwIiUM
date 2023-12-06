package pl.polsl.lab.controller;

//import java.util.Scanner;
import pl.polsl.lab.model.Planet;
import pl.polsl.lab.view.PlanetView;

/**
 * @author Martyna Szczekocka
 * @version 1.0
 */
public class PlanetController {
    private Planet planet;
    private PlanetView planetView;

    public PlanetController() {
        this.planet = new Planet();
        this.planetView = new PlanetView(planet);
    }
    
    public void getParametersFromUser() {
    }
    
}
