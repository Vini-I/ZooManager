/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animals;

import java.time.LocalDate;
import Util.UtilDate;

/**
 *
 * @author autoa
 */
public class Animal {
    private static final String idRegex = "^[A-Z]{1}-\\d{4}$";
    private String id;
    private String name;
    private String species;
    private LocalDate birthDate;
    private PossibleLocations currentLocation;
    private LocalDate arrival;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public PossibleLocations getCurrentLocation() {
        return currentLocation;
    }

    public LocalDate getArrival() {
        return arrival;
    }

    public void setCurrentLocation(PossibleLocations currentLocation) {
        this.currentLocation = currentLocation;
    }

    public Animal(String id, String name, String species, LocalDate birthDate) {
        if (id.matches(idRegex))
            this.id = id;
        this.name = name;
        this.species = species;
        if (UtilDate.verifyBirth(birthDate))
            this.birthDate = birthDate;
        this.currentLocation = PossibleLocations.CONSERVATIONANDRESCUE;
        this.arrival = LocalDate.now();
    }
    
    
}
