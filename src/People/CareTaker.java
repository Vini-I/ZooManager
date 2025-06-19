/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package People;

import Animals.Animal;
import java.time.LocalDate;

/**
 *
 * @author autoa
 */
public class CareTaker extends EmployeeBase{
    private String speciality;
    private String[] log = new String[200];

    public String getSpeciality() {
        return speciality;
    }

    public CareTaker(int id, String name, LocalDate birthDate, String phoneNum, int Salary, String speciality) {
        super(id, name, birthDate, phoneNum, Salary);
        this.speciality = speciality;
    }
    
    public int searchFree(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null || arr[i].isBlank()) {
                return i;
            }
        }
        return -1;
    }
    
    public String FeedAnimal(Animal animal) {
        int i = searchFree(this.log);
        if ( i >= 0) {
            this.log[i] = "Se alimento a " + animal.getName();
            return animal.getName() + " has been fed";
        }
        return "No se puede agregar al Log";
    }
    
    public String CheckHealth(Animal animal) {
        int i = searchFree(this.log);
        if ( i >= 0) {
            this.log[i] = "Se reviso a " + animal.getName();
            return animal.getName() + " is healthy";
        }
        return "No se puede agregar al Log";
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + speciality;
    }
    
    
}
