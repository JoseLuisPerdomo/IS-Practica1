package org.ulpgc.is1.model;

public class Vehicle {
    private String make;
    private String model;
    private Plate plate;
    private Costumer owner;

    public Vehicle(String make, String model, Plate plate, Costumer owner) {
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


