package org.ulpgc.is1.model;
import java.util.ArrayList;
import java.util.List;

public class RepairManager {

    //Constructor
    private List<Mechanic> mechanics;
    private List<Vehicle> vehicles;
    private List<Item> items;
    public RepairManager() {
        this.mechanics = new ArrayList<>();
        this.vehicles = new ArrayList<>();
        this.items = new ArrayList<>();
    }


    //Getters & Setters
    public List<Mechanic> getMechanics() {
        return mechanics;
    }
    public void setMechanics(List<Mechanic> mechanics) {
        this.mechanics = mechanics;
    }
    public List<Vehicle> getVehicles() {
        return vehicles;
    }
    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
    public List<Item> getItems() {
        return items;
    }


    //Methods
    public void addMechanic(Mechanic newMechanic) {
        if (!mechanics.contains(newMechanic)){
            mechanics.add(newMechanic);
        }
    }
    public void addVehicle(Vehicle newVehicle){
        vehicles.add(newVehicle);
    }

    public void removeVehicle(Vehicle vehicle){
        vehicles.remove(vehicle);
        Vehicle.count -= 1;
    }
    public Mechanic getMechanic(int index){
        return getMechanics().get(index);
    }
    public Vehicle getVehicle(int index){
        return getVehicles().get(index);
    }
    public Repair repair(int mechanicIndex, int repairIndex){
        return getMechanic(mechanicIndex).getRepairs().get(repairIndex);
    }

}
