package org.ulpgc.is1.model;

public class Plate {

    //Constructor
    private String number;
    public Plate(String number) {
        if (isValid(number)){
            this.number = number;
        }else {
            System.out.println("Invalid plate number.");
        }
    }


    //Getters & Setters
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }


    //Methods
    public boolean isValid(String number) {
            return number.toUpperCase().matches("^[0-9]{4}[A-Z]{3}$");
    }

}
