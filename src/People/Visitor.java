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
public class Visitor {
    private static final String phoneRegex = "^\\d{2}-\\d{2}-\\d{2}-\\d{2}-";
    private int id;
    private String name;
    private LocalDate birthDate;
    private String phoneNum;
    
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
    
    public Visitor(int id, String name, LocalDate birthDate, String phoneNum, int salary) {
        this.id = id;
        this.birthDate = birthDate;
        if (phoneNum.matches(phoneRegex))
            this.phoneNum = phoneNum;
    }
    
    @Override
    public String toString() {
        return "\nVisitor: \nId: " + id + "\nName: " + name + "\nBirth Date: " + birthDate + "\nPhone Number: " + phoneNum;
    }
    
    
}
