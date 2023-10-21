package org.ulpgc.is1.model;
import java.util.ArrayList;
import java.util.List;

public class SparePart {

    //Constructor
    //TODO Make the relation between SpareParts and Repair
    private String name;
    private int price;
    private List<Repair> repairs;
    public SparePart(String name, int price) {
        this.name = name;
        this.price = price;
        this.repairs = new ArrayList<>();
    }


    //Getters & Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public List<Repair> getRepairs() {
        return repairs;
    }
    public void setRepairs(List<Repair> repairs) {
        this.repairs = repairs;
    }

}
