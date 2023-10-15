package org.ulpgc.is1.model;

public class Costumer {
    public String name;
    public Phone phone;

    public Costumer(String name, Phone phone){
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public Phone getPhone() {
        return phone;
    }
}
