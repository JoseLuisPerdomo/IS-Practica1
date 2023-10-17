package org.ulpgc.is1.model;

public class Phone {
    public String number;

    //Todo make it primitive

    public Phone(String number) {
        this.number = number;
    }

    public boolean isValid() {
        return number.toUpperCase().matches("^[0-9]{9}$");
    }

    public String getNumber() {
        return number;
    }
}

