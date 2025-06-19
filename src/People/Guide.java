/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package People;

import Animals.Animal;
import java.util.Arrays;
import java.time.LocalDate;

/**
 *
 * @author autoa
 */
public class Guide extends EmployeeBase {
     private String[] language = new String[20];
    private String[] log = new String[200];

    public String getLanguage() {
        return Arrays.toString(language);
    }

    public void setLanguage(String[] language) {
        this.language = language;
    }

    public Guide(int id, String name, LocalDate birthDate, String phoneNum, int Salary) {
        super(id, name, birthDate, phoneNum, Salary);
        this.language[0] = "Spanish";
    }
    
    private int searchFree(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null || arr[i].isBlank()) {
                return i;
            }
        }
        return -1;
    }
    
    private String giveTour(Animal animal1, Animal animal2, Animal animal3) {
        int i = searchFree(this.log);
        if ( i >= 0) {
            this.log[i] = "Se realizo un tour";
            animal1.toString();
            animal2.toString();
            animal3.toString();
            return "Se realizo un tour";
        }
        return "No se puede agregar al Log";
    }
    
    
}
