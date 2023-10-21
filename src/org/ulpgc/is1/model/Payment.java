package org.ulpgc.is1.model;

import java.util.Date;

public class Payment {

    //Constructor
    private Date date;
    private int amount;
    public Payment(Date date, int amount){
        this.amount = amount;
        this.date = date;
    }


    //Getters & Setters
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
}
