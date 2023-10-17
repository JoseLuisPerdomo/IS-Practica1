package org.ulpgc.is1.model;

public class Plate {
    private String number;

    public Plate(String number) {
        this.number = number;
    }

    //TODO Improve method isValid.
    public boolean isValid() {
        if (number != "") {
            return true;
        } else {
            return false;
        }
    }

    public String getNumber() {
        return number;
    }
}
