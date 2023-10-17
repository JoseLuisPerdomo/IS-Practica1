package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class RepairManager {
    private List<Mechanic> mechanics;
    private List<Vehicle> vehicles;
    private List<SparePart> spareParts;

    public RepairManager() {
        this.mechanics = new ArrayList<>();
        this.vehicles = new ArrayList<>();
        this.spareParts = new ArrayList<>();
    }

    public void addMechanic(Mechanic newMechanic) {
        mechanics.add(newMechanic);
    }

    public void addVehicle(Vehicle newVehicle) {
        vehicles.add(newVehicle);
    }

    //TODO Methods Repair and getMechanic/Vehicle

    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public List<SparePart> getSpareParts() {
        return spareParts;
    }
}
