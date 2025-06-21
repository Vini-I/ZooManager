/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author autoa
 */
public class UtilDate {
    public static int AgeCalc(LocalDate birth) {
        return Period.between(birth, LocalDate.now()).getYears();
    }
    
    public static boolean verifyAge(LocalDate birth) {
    return Period.between(birth, LocalDate.now()).getYears() >= 18;
    }
    
    public static boolean verifyBirth(LocalDate birth) {
        return birth.isBefore(LocalDate.now());
    }
}
