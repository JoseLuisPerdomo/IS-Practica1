package org.ulpgc.is1.model;
import java.util.*;

public class Mechanic {

    //Constructor
    private String name;
    private String surname;
    private List<Repair> repairs;
    public Mechanic(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.repairs = new ArrayList<>();
    }


    //Getters & setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public List<Repair> getRepairs() {
        return repairs;
    }
    public void setRepairs(List<Repair> repairs) {
        this.repairs = repairs;
    }


    // Methods
    public void addRepair(Repair repair) {
        if (repairs.contains(repair)) {
            repairs.add(repair);
            repair.getMechanics().add(this);
        }
    }
    public void removeMechanic(Repair repair) {
        repairs.remove(repair);
        repair.getMechanics().remove(this);
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

}
