/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tours;

import Animals.Animal;
import People.Guide;
import People.Visitor;
import java.time.LocalDate;
import java.util.Arrays;
/**
 *
 * @author autoa
 */
public class Tour {
    private String[] log = new String[200];
    Animal[] animals = new Animal[10];
    Visitor[] visitors = new Visitor[10];
    
    public void addVisitor(Visitor visitor) {
        for (int i = 0; i < visitors.length; i++) {
             if(visitors[i]==null) 
                 visitors[i] = visitor;
        }
    }
    
    public void addAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
             if(animals[i]==null) 
                 animals[i] = animal;
        }
    }

    public void tourLog(Guide guide) {
    int max = log.length;
        for (int i = 0; i < max; i++) {
             if(log[i]==null || log[i].isBlank()) {
                 log[i] = "\nTour: " + i + "\nResponsibleGuide: " + guide.getId() + "\nDate: " + LocalDate.now() + "\nVisitors: " + Arrays.toString(visitors) + "\nAnimals visited: " + Arrays.toString(animals);
             }
        }
    }
    
    
}
