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
public abstract class EmployeeBase {
    private static final String phoneRegex = "^\\d{2}-\\d{2}-\\d{2}-\\d{2}-";
    protected int id;
    protected String name;
    protected LocalDate birthDate;
    protected String phoneNum;
    protected int Salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public int getSalary() {
        return Salary;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }
    
    public boolean verifyAge(LocalDate fechaNacimiento) {
    LocalDate hoy = LocalDate.now();
    Period edad = Period.between(fechaNacimiento, hoy);
    return !fechaNacimiento.isAfter(hoy) && edad.getYears() >= 18;
    }
    
    public EmployeeBase(int id, String name, LocalDate birthDate, String phoneNum, int salary) {
        this.id = id;
        this.name = name;
         if (verifyAge(birthDate))
            this.birthDate = birthDate;
        if (phoneNum.matches(phoneRegex))
            this.phoneNum = phoneNum;
        if (salary > 300000)
            this.Salary = salary;
    }
    

    @Override
    public String toString() {
        return "\nEmployee: \nId: " + id + "\nName: " + name + "\nBirth Date: " + birthDate + "\nPhone Number: " + phoneNum + "\nSalary: " + Salary;
    }
    
    
}

    
