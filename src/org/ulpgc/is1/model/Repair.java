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
    private List <Item> items;
    private Payment payment;

    private int controlPayments = 0;
    public Repair(Date date, String description, int effort, Vehicle vehicle, BreakdownTypes breakdownType) {
        this.id = NEXT_ID++;
        this.date = date;
        this.description = description;
        this.effort = effort;
        this.vehicle = vehicle;
        this.mechanics = new ArrayList<>();
        this.breakdownType = breakdownType;
        this.items = new ArrayList<>();
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
    public List<Item> getItems() {
        return items;
    }
    public int getPrice(){
        if (controlPayments == 1){
            return payment.getAmount();
        }
        else {
            return 0;
        }
    }


    //Methods
    public void addMechanic(Mechanic mechanic) {
        if (mechanics.contains(mechanic)) {
            mechanics.add(mechanic);
            mechanic.getRepairs().add(this);
        }
    }
    public void removeMechanic(Mechanic mechanic) {
        mechanics.remove(mechanic);
        mechanic.getRepairs().remove(this);
    }

    public void addItem(Item item){
        if (!items.contains(item)) {
            items.add(item);
            item.getRepair().add(this);
        }
    }

    public void removeItem(Item item){
        items.remove(item);
        item.getRepair().remove(this);
    }
    public boolean price(){ //Devuelve true si el precio se crea correctamente
        if (controlPayments == 0){
            this.payment =  new Payment(effort + items.stream().map(item -> item.getSparePart().getPrice() * item.getQuantity()).reduce(0, Integer::sum), date);
            controlPayments++;
            return true;
        } else {
            System.out.println("Repair has already a payment.");
            return false;
        }
    }

}
