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
public abstract class EmployeeBase {
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

    @Override
    public String toString() {
        return "\nEmployee: \nId: " + id + "\nName: " + name + "\nBirth Date: " + birthDate + "\nPhone Number: " + phoneNum + "\nSalary: " + Salary;
    }
    
    
}
