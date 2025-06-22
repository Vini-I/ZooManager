/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Animals.*;
import People.*;
import Tours.Tour;
import Visits.Visit;
import java.time.LocalDate;
import java.util.Arrays;

/**
 *
 * @author autoa
 */
public class Zoo {
    public static AnimalList animals = new AnimalList();
    public static CareTakerList careTakers = new CareTakerList();
    public static GuideList guides = new GuideList();
    public static String[] ctLog = new String[500];
    public static String[] guideLog = new String[500];
    public static Visit visits;
    
    public static boolean AddAnimal(String id, String name, String species, LocalDate birthDate) {
        Animal p = new Animal(id, name, species, birthDate);
        return animals.add(p);
    }
    
    public static boolean AddGuide(int id, String name, LocalDate birthDate, String phoneNum, int Salary) {
        Guide g = new Guide(id, name, birthDate, phoneNum, Salary);
        return guides.add(g);
    }
    
    public static boolean AddCareTaker(int id, String name, LocalDate birthDate, String phoneNum, int salary, String speciality) {
        CareTaker c = new CareTaker(id, name, birthDate, phoneNum, salary, speciality);
        return careTakers.add(c);
    }
    
    public static boolean registerCareTakerFeed(CareTaker ct, Animal animal){
        for (int i = 0; i < ctLog.length; i++) {
            if (ctLog[i]==null){
                String ctlEntry = "\nCareTaker: " + ct.getId() + ct.FeedAnimal(animal);
                ctLog[i] = ctlEntry;
                return true;
            }
        }
        return false;
    }
    
    public static boolean registerCareTakerHealtCheck(CareTaker ct, Animal animal){
        for (int i = 0; i < ctLog.length; i++) {
            if (ctLog[i]==null){
                String ctlEntry = "\nCareTaker: " + ct.getId() + ct.CheckHealth(animal);
                ctLog[i] = ctlEntry;
                return true;
            }
        }
        return false;
    }
    
    public static boolean registerGuideTour(Guide guide, Tour tour){
        for (int i = 0; i < ctLog.length; i++) {
            if (ctLog[i]==null){
                String ctlEntry = "\nCareTaker: " + guide.getId() + guide.giveTour(tour);
                ctLog[i] = ctlEntry;
                return true;
            }
        }
        return false;
    }
    
    public static void registerVisit(Visitor visitor) {
        visits.visitorLog(visitor);
    }
    
    public static String viewGuideLog(Guide guide) {
        return Arrays.toString(guide.getLog());
    }
    
    public static String viewCareTakerLog(CareTaker ct) {
        return Arrays.toString(ct.getLog());
    }
    
    public static String viewAnimalsVisited(Tour tour) {
        return Arrays.toString(tour.getAnimals());
    }
    
    
}
