package org.ulpgc.is1.model;
import java.util.*;

//TODO Creation of newPayment

public class Repair {
    private static int NEXT_ID = 0;
    private final int id;
    public Date date;
    public String description;
    public int effort;
    public Vehicle vehicle;
    public List <Mechanic> mechanics;
    public Set<BreakdownTypes> breakdownTypes;;

    public Repair(Date date, String description, int effort, Vehicle vehicle, BreakdownTypes breakdownTypes) {
        this.id = NEXT_ID++;
        this.date = date;
        this.description = description;
        this.effort = effort;
        this.vehicle = vehicle;
        this.mechanics = new ArrayList<Mechanic>();
        this.breakdownTypes = new HashSet<>();
    }

    public void price(){

    }

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

    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    public Set<BreakdownTypes> getBreakTypes() {
        return breakdownTypes;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public int getEffort() {
        return effort;
    }
}
