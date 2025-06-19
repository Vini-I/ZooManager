/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package People;

import java.time.LocalDate;

/**
 *
 * @author autoa
 */
public class Visitor extends Person {

    public Visitor(int id, String name, LocalDate birthDate, String phoneNum) {
        super(id, name, birthDate, phoneNum);
    }
    
    public Visitor(int id, String name, LocalDate birthDate) {
        super(id, name, birthDate);
    }
   
}
