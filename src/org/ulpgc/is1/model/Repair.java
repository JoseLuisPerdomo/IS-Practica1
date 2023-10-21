package org.ulpgc.is1.model;
import java.util.*;


public class Repair {

    //Constructor
    //TODO create a payment that accepts null and payment
    private static int NEXT_ID = 0;
    private final int id;
    private Date date;
    private String description;
    private int effort;
    private Vehicle vehicle;
    private List <Mechanic> mechanics;
    private Set<BreakdownTypes> breakdownTypes;
    private List <SparePart> spareParts;
    private Payment payment;
    public Repair(Date date, String description, int effort, Vehicle vehicle, BreakdownTypes breakdownTypes, SparePart spareParts, Payment payment) {
        this.id = NEXT_ID++;
        this.date = date;
        this.description = description;
        this.effort = effort;
        this.vehicle = vehicle;
        this.mechanics = new ArrayList<Mechanic>();
        this.breakdownTypes = new HashSet<>();
        this.spareParts = (List<SparePart>) spareParts;
        this.payment = payment;
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
    public Set<BreakdownTypes> getBreakdownTypes() {
        return breakdownTypes;
    }
    public void setBreakdownTypes(Set<BreakdownTypes> breakdownTypes) {
        this.breakdownTypes = breakdownTypes;
    }
    public List<SparePart> getSpareParts() {
        return spareParts;
    }
    public void setSpareParts(List<SparePart> spareParts) {
        this.spareParts = spareParts;
    }
    public Payment getPayment() {
        return payment;
    }
    public void setPayment(Payment payment) {
        this.payment = payment;
    }


    //Methods
    //TODO price method
    public void addBreakType(BreakdownTypes breakType) {
        breakdownTypes.add(breakType);
    }
    public void addMechanic(Mechanic mechanic) {
        mechanics.add(mechanic);
        mechanic.getRepairs().add(this);
    }
    public void removeMechanic(Mechanic mechanic) {
        mechanics.remove(mechanic);
        mechanic.getRepairs().remove(this);
    }
    public void price(){

    }


}
