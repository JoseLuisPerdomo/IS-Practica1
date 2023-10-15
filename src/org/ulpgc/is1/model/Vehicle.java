package org.ulpgc.is1.model;

public class Vehicle {
    public String make;
    public String model;
    public Plate plate;
    //TODO Make the relation between Vehicle and Repair / and Costumer

    public Vehicle (String make, String model, Plate plate){
        this.make = make;
        this.model = model;
        this.plate = plate;
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
}
