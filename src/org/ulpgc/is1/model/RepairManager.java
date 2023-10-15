package org.ulpgc.is1.model;
import java.util.ArrayList;
import java.util.List;

public class RepairManager {
    public List mechanics;
    public List vehicles;
    public List spareParts;

    public RepairManager(List mechanics, List vehicles, List spareParts) {
        this.mechanics = new ArrayList<Mechanic>();
        this.vehicles = new ArrayList<Vehicle>();
        this.spareParts = new ArrayList<SparePart>();
    }

    public void addMechanic(Mechanic newMechanic){
        mechanics.add(newMechanic);
    }

    public void addVehicle(Vehicle newVehicle){
        vehicles.add(newVehicle);
    }

    //TODO Methods Repair and getMechanic/Vehicle

    public List getMechanics() {
        return mechanics;
    }

    public List getVehicles() {
        return vehicles;
    }

    public List getSpareParts() {
        return spareParts;
    }
}
