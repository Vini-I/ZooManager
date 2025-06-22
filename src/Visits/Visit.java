/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Visits;

import People.Visitor;
import java.time.LocalDate;

/**
 *
 * @author autoa
 */
public class Visit {
    private String[] log = new String[200];

    public void visitorLog(Visitor visitante) {
            int max = log.length;
            for (int i = 0; i < max; i++) {
                 if(log[i]==null || log[i].isBlank()){
                      log[i]= "\nVisitante: " + visitante.getId() +"\nFecha:"+ LocalDate.now();
                 }
            }
        }

    public Visit() {
    }
    
}
