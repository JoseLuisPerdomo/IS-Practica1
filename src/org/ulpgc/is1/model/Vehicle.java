package org.ulpgc.is1.model;

public class Vehicle {
    public String make;
    public String model;
    public Plate plate;
    public Costumer owner;

    public Vehicle (String make, String model, Plate plate, Costumer owner){
        this.make = make;
        this.model = model;
        this.plate = plate;
        this.owner = owner;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Plate getPlate() {
        return plate;
    }

    public Costumer getOwner() {
        return owner;
    }
}


