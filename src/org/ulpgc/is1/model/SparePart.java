package org.ulpgc.is1.model;

public class SparePart {
    public String name;
    public int price;
    public Repair repair;

    //TODO Make the relation between SpareParts and Repair


    public SparePart(String name, int price, Repair repair) {
        this.name = name;
        this.price = price;
        this.repair = repair;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Repair getRepair() {
        return repair;
    }
}
