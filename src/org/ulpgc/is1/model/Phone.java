package org.ulpgc.is1.model;

public class Phone {

    //Constructor
    private String number;
    public Phone(String number) {
        if (isValid(number)){
            this.number = number;
            System.out.println("Phone number saved correctly.");
        } else{
            this.number = "XXXX";
            System.out.println("Invalid phone number.");
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
        return number.toUpperCase().matches("^[0-9]{9}$");
    }

}

