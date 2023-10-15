package org.ulpgc.is1.model;

public class Mechanic {
    public String name;
    public String surname;
    public Repair repair;

    //TODO Relation between Mechanic and Repair

    public Mechanic(String name, String surname, Repair repair) {
        this.name = name;
        this.surname = surname;
        this.repair = repair;
    }
}
