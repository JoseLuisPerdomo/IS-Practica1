package org.ulpgc.is1.model;
import java.util.*;


public class Repair {

    //Constructor
    private static int NEXT_ID = 0;
    private final int id;
    private Date date;
    private String description;
    private int effort;
    private Vehicle vehicle;
    private List <Mechanic> mechanics;
    private BreakdownTypes breakdownType;
    private List <SparePart> spareParts;
    public Repair(Date date, String description, int effort, Vehicle vehicle, List<Mechanic> mechanic, BreakdownTypes breakdownType, List<SparePart> spareParts) {
        this.id = NEXT_ID++;
        this.date = date;
        this.description = description;
        this.effort = effort;
        this.vehicle = vehicle;
        this.mechanics = mechanic;
        this.breakdownType = breakdownType;
        this.spareParts = spareParts;
    }


    //Getters setters
    public int getId() {
        return id;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getEffort() {
        return effort;
    }
    public void setEffort(int effort) {
        this.effort = effort;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public List<Mechanic> getMechanics() {
        return mechanics;
    }
    public void setMechanics(List<Mechanic> mechanics) {
        this.mechanics = mechanics;
    }
    public BreakdownTypes getBreakdownType() {
        return breakdownType;
    }
    public void setBreakdownTypes(BreakdownTypes breakdownTypes) {
        this.breakdownType = breakdownTypes;
    }
    public List<SparePart> getSpareParts() {
        return spareParts;
    }
    public void setSpareParts(List<SparePart> spareParts) {
        this.spareParts = spareParts;
    }


    //Methods
    public void addMechanic(Mechanic mechanic) {
        mechanics.add(mechanic);
        mechanic.getRepairs().add(this);
    }
    public void removeMechanic(Mechanic mechanic) {
        mechanics.remove(mechanic);
        mechanic.getRepairs().remove(this);
    }
    public String price(int amount, Date date){
        Payment payment =  new Payment(amount, date);
        return payment.toString();
    }

}
