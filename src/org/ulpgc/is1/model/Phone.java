package org.ulpgc.is1.model;

public class Phone {
    public String number;

    public Phone(String number) {
        this.number = number;
    }

    public boolean isValid() {
        if (number != ""){
            return true;
        }
        else {
            return false;
        }
    }

    public String getNumber() {
        return number;
    }
}

