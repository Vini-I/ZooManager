/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package People;

import Animals.Animal;
import Tours.Tour;
import java.util.Arrays;
import java.time.LocalDate;

/**
 *
 * @author autoa
 */
public class Guide extends EmployeeBase {
     private String[] language = new String[20];
    private Tour[] log = new Tour[200];

    public String getLanguage() {
        return Arrays.toString(language);
    }

    public void setLanguage(String[] language) {
        if (searchFree(language) >= 1)
            this.language = language;
    }

    public Guide(int id, String name, LocalDate birthDate, String phoneNum, int Salary) {
        super(id, name, birthDate, phoneNum, Salary);
        this.language[0] = "Spanish";
    }
    
    public int searchFree(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null || arr[i].isBlank()) {
                return i;
            }
        }
        return -1;
    }
    
    public String giveTour(Tour tour) {
        int j = -1;
        for (int i = 0; i < log.length; i++) {
            if (log[i] == null) {
                j = i;
            }
        }
        if ( j >= 0) {
            this.log[j] = tour;
            return "Se realizo un tour";
        }
        return "No se puede agregar al Log";
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nLanguages: " + Arrays.toString(language) ;
    }
    
}
