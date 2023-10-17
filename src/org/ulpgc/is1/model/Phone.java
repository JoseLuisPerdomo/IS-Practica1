package org.ulpgc.is1.model;

public class Phone {
    private String number;

    //Todo make it primitive
    //TODO Improve method isValid.

    public Phone(String number) {
        this.number = number;
    }

    public boolean isValid() {
        return !number.isEmpty();
    }

    public String getNumber() {
        return number;
    }
}

