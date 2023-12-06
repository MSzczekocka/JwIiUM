package pl.polsl.lab.model;

import com.opencsv.bean.CsvBindByPosition;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Martyna Szczekocka
 * @version 1.0
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class Planet {
    
    /**
     * Model class
     * 
     * @param dayLength - length of day on particular planet in [min]
     * @param rotationPeriod - rotation period of planet in [min]
     * @param weight - weight of the planet in []
     * @param averageTemperature - average temperature of the planet in []
     * @param distanceToTheSun - planet distance to the Sun in []
     * @param hasMagneticField - information about containing magnetic field by planet 
     */
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @CsvBindByPosition(position = 0)
    private String name;
    @CsvBindByPosition(position = 1)
    private String color;
    @CsvBindByPosition(position = 2)
    private double mass;
    @CsvBindByPosition(position = 3)
    private int diameter;
    @CsvBindByPosition(position = 4)
    private int density;
    @CsvBindByPosition(position = 5)
    private double surfaceGravity;
    @CsvBindByPosition(position = 6)
    private double escapeVelocity;
    @CsvBindByPosition(position = 7)
    private double rotationPeriod;
    @CsvBindByPosition(position = 8)
    private double dayLength;
    @CsvBindByPosition(position = 9)
    private double distanceToTheSun;
    @CsvBindByPosition(position = 10)
    private double perihelion;
    @CsvBindByPosition(position = 11)
    private double aphelion;
    @CsvBindByPosition(position = 12)
    private double orbitalPeriod;
    @CsvBindByPosition(position = 13)
    private double orbitalVelocity;
    @CsvBindByPosition(position = 14)
    private double orbitalInclination;
    @CsvBindByPosition(position = 15)
    private double orbitalEccentricity;
    @CsvBindByPosition(position = 16)
    private double obliquityToOrbit;
    @CsvBindByPosition(position = 17)
    private double averageTemperature;
    @CsvBindByPosition(position = 18)
    private String surfacePressure;
    @CsvBindByPosition(position = 19)
    private int numberOfMoons;
    @CsvBindByPosition(position = 20)
    private boolean hasRingSystem;
    @CsvBindByPosition(position = 21)
    private boolean hasMagneticField;
    
    //method giving pearson correlation coeffitient
    public double coutPearsonCorrelationCoeffitient() throws ArithmeticException {
        return this.dayLength * 1.0 / this.rotationPeriod;
    }

    @Override
    public String toString() {
        return "Planet{" + "name=" + name + ", color=" + color + ", mass=" + mass + ", diameter=" + diameter + ", density=" + density + ", surfaceGravity=" + surfaceGravity + ", escapeVelocity=" + escapeVelocity + ", rotationPeriod=" + rotationPeriod + ", dayLength=" + dayLength + ", distanceToTheSun=" + distanceToTheSun + ", perihelion=" + perihelion + ", aphelion=" + aphelion + ", orbitalPeriod=" + orbitalPeriod + ", orbitalVelocity=" + orbitalVelocity + ", orbitalInclination=" + orbitalInclination + ", orbitalEccentricity=" + orbitalEccentricity + ", obliquityToOrbit=" + obliquityToOrbit + ", averageTemperature=" + averageTemperature + ", surfacePressure=" + surfacePressure + ", numberOfMoons=" + numberOfMoons + ", hasRingSystem=" + hasRingSystem + ", hasMagneticField=" + hasMagneticField + '}';
    }

    public double getMass() {
        return mass;
    }
    
    
    
}
