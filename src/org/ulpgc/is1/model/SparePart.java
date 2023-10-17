package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class SparePart {
    private String name;
    private int price;
    public List<Repair> repairs;

    //TODO Make the relation between SpareParts and Repair


    public SparePart(String name, int price) {
        this.name = name;
        this.price = price;
        this.repairs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
