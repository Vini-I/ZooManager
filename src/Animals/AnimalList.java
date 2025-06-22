/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animals;

import Main.Lists;
import java.util.Arrays;

/**
 *
 * @author autoa
 */
public class AnimalList implements Lists <Animal> {
    private static Animal[] list = new Animal[200];

    @Override
    public boolean add(Animal t) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) {
                list[i] = t;
                return true;
            }
        }
        return false;
    }

    @Override
    public Animal search(Object id) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].getId() == id) {
                return list[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return Arrays.toString(list);
    }

    public AnimalList() {
    }
    
}
