package org.ulpgc.is1.model;
import java.util.*;

public class Mechanic {
    public String name;
    public String surname;
    public List<Repair> repairs;


    public Mechanic(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.repairs = new ArrayList<>();
    }

    public List<Repair> getRepairs() {
        return repairs;
    }

    public void addRepair(Repair repair) {
        repairs.add(repair);
        repair.getMechanics().add(this);
    }

    public void removeMechanic(Repair repair) {
        repairs.remove(repair);
        repair.getMechanics().remove(this);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
