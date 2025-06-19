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
public abstract class Person {
    private static final String phoneRegex = "^\\d{2}-\\d{2}-\\d{2}-\\d{2}-";
    protected int id;
    protected String name;
    protected LocalDate birthDate;
    protected String phoneNum;
    
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

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Person(int id, String name, LocalDate birthDate, String phoneNum) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        if (phoneNum.matches(phoneRegex))
            this.phoneNum = phoneNum;
    }
    
     public Person(int id, String name, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }
    
    @Override
    public String toString() {
        return "\nPerson: \nId: " + id + "\nName: " + name + "\nBirth Date: " + birthDate + "\nPhone Number: " + phoneNum;
    }
    
}
