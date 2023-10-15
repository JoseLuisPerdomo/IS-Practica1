package org.ulpgc.is1.model;

public class Plate {
    public String number;

    public Plate(String number) {
        this.number = number;
    }
//TODO Improve method isValid.
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
