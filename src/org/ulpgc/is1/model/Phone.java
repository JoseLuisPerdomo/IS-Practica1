package org.ulpgc.is1.model;

public class Phone {

    //Constructor
    //TODO make it primitive
    private String number;
    public Phone(String number) {
        this.number = number;
    }


    //Getters & Setters
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }


    //Methods
    //TODO implement in constructor
    public boolean isValid() {
        return number.toUpperCase().matches("^[0-9]{9}$");
    }

}

