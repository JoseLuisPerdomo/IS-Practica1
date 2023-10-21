package org.ulpgc.is1.model;

public class Vehicle {

    //Constructor
    private String make;
    private String model;
    private Plate plate;
    private Costumer owner;
    public Vehicle (String make, String model, Plate plate, Costumer owner){
        this.make = make;
        this.model = model;
        this.plate = plate;
        this.owner = owner;
    }


    //Getters & Setters
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public Plate getPlate() {
        return plate;
    }
    public void setPlate(Plate plate) {
        this.plate = plate;
    }
    public Costumer getOwner() {
        return owner;
    }
    public void setOwner(Costumer owner) {
        this.owner = owner;
    }

}


