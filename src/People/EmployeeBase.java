/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package People;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author autoa
 */
public abstract class EmployeeBase extends Person{
    protected int Salary;

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }
    
    public boolean verifyAge(LocalDate fechaNacimiento) {
    LocalDate hoy = LocalDate.now();
    Period edad = Period.between(fechaNacimiento, hoy);
    return !fechaNacimiento.isAfter(hoy) && edad.getYears() >= 18;
    }
    
    public EmployeeBase(int id, String name, LocalDate birthDate, String phoneNum, int salary) {
        super(id, name, birthDate, phoneNum);
        if (salary > 300000)
            this.Salary = salary;
    }
    

    @Override
    public String toString() {
        return "\nEmployee: \nId: " + id + "\nName: " + name + "\nBirth Date: " + birthDate + "\nPhone Number: " + phoneNum + "\nSalary: " + Salary;
    }
    
    
}

    
