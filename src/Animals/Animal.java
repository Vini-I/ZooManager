/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animals;

import java.time.LocalDateTime;

/**
 *
 * @author autoa
 */
public class Animal {
    private static final String idRegex = "^[A-Z]{1}-\\d{4}$";
    private String id;
    private String name;
    private String species;
    private LocalDateTime birthDate;
    private PossibleLocations currentLocation;
    private LocalDateTime arrival;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public PossibleLocations getCurrentLocation() {
        return currentLocation;
    }

    public LocalDateTime getArrival() {
        return arrival;
    }

    public void setCurrentLocation(PossibleLocations currentLocation) {
        this.currentLocation = currentLocation;
    }

    public Animal(String id, String name, String species, LocalDateTime birthDate, LocalDateTime arrival) {
        if (id.matches(idRegex))
            this.id = id;
        this.name = name;
        this.species = species;
        if (birthDate.isBefore(LocalDateTime.now()))
            this.birthDate = birthDate;
        this.currentLocation = PossibleLocations.CONSERVATIONANDRESCUE;
        this.arrival = arrival;
    }
    
    
}
