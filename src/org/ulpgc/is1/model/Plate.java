package org.ulpgc.is1.model;

public class Plate {
    public String number;

    public Plate(String number) {
        this.number = number;
    }

        public boolean isValid() {
            return number.toUpperCase().matches("^[0-9]{4}[A-Z]{3}$");
        }

    public String getNumber() {
        return number;
    }
}
