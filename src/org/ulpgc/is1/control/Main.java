package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;
import java.util.Date;
import java.util.List;


public class Main {

    //Global variables
    public static Mechanic mecanico1;
    public static Mechanic mecanico2;
    public static Vehicle vehiculo1;
    public static Vehicle vehiculo2;
    public static SparePart pieza1;
    public static SparePart pieza2;
    public static RepairManager repairManager = new RepairManager();
    public static Repair repair;


    public static void main(String[] args) {
        init();
        printMechanic1();
        printVehicle2();
        createRepairObject();
        formalizePayment();
        deleteVehicle();
        vehicleAmount();
        repairInfo();
    }

    //Methods
    public static void init(){
        mecanico1 = new Mechanic("Pedro", "Quevedo");
        mecanico2 = new Mechanic("José", "Perdomo");
        vehiculo1 = new Vehicle("Ford", "Fiesta",
                new Plate("4517HGK"),
                new Costumer("Antonio",
                        new Phone("696 69 69 69")));
        vehiculo2 = new Vehicle("Mercedes", "Benz",
                new Plate("3412TDF"),
                new Costumer("Makeko",
                        new Phone("131 13 13 13")));
        pieza1 = new SparePart("Tubo de escape", 32);
        pieza2 = new SparePart("Capó", 45);
    }
    public static void printMechanic1 (){
        System.out.printf("""
                
                Mecánico1:
                    - Name: %s
                    - Surname: %s
                    - Repairs: %s""",
                mecanico1.getName(), mecanico1.getSurname(), mecanico1.getRepairs().toString());
    }
    public static void printVehicle2 (){
        System.out.printf("""
                \n
                Vehiculo2:
                	- Make: %s
                	- Model: %s
                	- Plate: %s
                	- Owner: %s
                """,
                vehiculo2.getMake(), vehiculo2.getModel(), vehiculo2.getPlate().getNumber(),
                vehiculo2.getOwner().getName());
    }
    public static void createRepairObject (){
        try {
            Date date = new Date();
            repairManager.addMechanic(mecanico1);


            repair = new Repair(
                    date,
                    "Cambio de capó y tubo de escape",
                    20,
                    vehiculo2,
                    BreakdownTypes.MECHANICAL);
            repair.addItem(new Item(1, pieza1));
            repair.addItem(new Item(2, pieza2));
        } catch (Exception e){System.out.println("Error: " + e);}
    }
    public static void formalizePayment () {
        if (repair.price()) {
            System.out.printf("\nPayment formalized correctly: %d", repair.getPrice());
        }
        else {
            System.out.println("\nPayment not formalized");
        }
    }
    public static void deleteVehicle(){
        try{
            repairManager.removeVehicle(vehiculo1);
            System.out.println("\nVehicle1 sucessfully deleted.");
        } catch (Exception e){
            System.out.println("\nFailure during deletion of vehicle.");
        }
    }
    public static void vehicleAmount(){
        System.out.println("\nNumber of vehicles: "+ Vehicle.count);
    }
    public static void repairInfo(){
        System.out.printf("""
                    \nRepair Data:
                        - Date: %s
                        - Description: %s
                        - Vehicle: %s
                        - Mechanic: %s
                        - Fail: %s
                        - Items: %s
                    """, repair.getDate(), repair.getDescription(), repair.getVehicle().toString(),
                repair.getMechanics().toString(), repair.getBreakdownType(), repair.getItems());
    }
}