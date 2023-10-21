package org.ulpgc.is1.model;

public class Phone {

    //Constructor
    private String number;
    public Phone(String number) {
        if (isValid(number)){
            this.number = number;
        } else{
            this.number = "XXXX";
            System.out.println("Invalid phone number. Saved as \"XXXX\"");
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
        return number.toUpperCase().matches("\\d{3} \\d{2} \\d{2} \\d{2}");
    }

}

