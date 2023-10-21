package org.ulpgc.is1.model;

public class Costumer {

    //Constructor
    private String name;
    private Phone phone;
    public Costumer(String name, Phone phone){
        this.name = name;
        this.phone = phone;
    }


    // Getters & setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Phone getPhone() {
        return phone;
    }
    public void setPhone(Phone phone) {
        this.phone = phone;
    }

}
