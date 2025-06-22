/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package People;

import Main.Lists;
import java.util.Arrays;

/**
 *
 * @author autoa
 */
public class GuideList implements Lists <Guide> {
    private static Guide[] list = new Guide[200];

    @Override
    public boolean add(Guide t) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) {
                list[i] = t;
                return true;
            }
        }
        return false;
    }

    @Override
    public Guide search(Object id) {
        int idt = Integer.parseInt(id.toString());
        for (int i = 0; i < list.length; i++) {
            if (list[i].getId() == idt) {
                return list[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return Arrays.toString(list);
    }

    public GuideList() {
    }
    
    
}
