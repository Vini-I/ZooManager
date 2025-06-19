/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Animals;

/**
 *
 * @author autoa
 */
public enum PossibleLocations {
    FARM ("Farm"),
    CONTACT ("Contact"),
    FEEDING ("Feeding"),
    CONSERVATIONANDRESCUE ("Conservation & Rescue"),
    NOCTURNTUNEL ("Nocturn tunel"),
    LOCALDIVERSITY ("Local biodiversity");
    
    private final String status;

    private PossibleLocations(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Current location: " + status;
    }
    
    
}
