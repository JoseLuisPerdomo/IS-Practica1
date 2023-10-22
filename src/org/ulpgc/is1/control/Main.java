package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;
import java.util.ArrayList;
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
    public static List <Mechanic> mechanics = new ArrayList<>();
    public static List <SparePart> spareParts = new ArrayList<>();
    public static Repair repair;


    public static void main(String[] args) {
        init(repairManager);
        printMechanic1();
        printVehicle2();
        createRepairObject();
        formalizePayment();
        deleteVehicle();
        vehicleAmount();
        repairInfo();
    }

    //Methods
    public static void init(RepairManager repairManager){
        mecanico1 = new Mechanic("Pedro", "Quevedo");
        mecanico2 = new Mechanic("José", "Perdomo");
        vehiculo1 = new Vehicle("Ford", "Fiesta",
                new Plate("4517HGK"),
                new Costumer("Antonio el mamao",
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
            Date fecha = new Date();
            mechanics.add(mecanico1);
            spareParts.add(pieza1);
            spareParts.add(pieza2);

            repair = new Repair(
                    fecha,
                    "Cambio de capó y tubo de escape",
                    20,
                    vehiculo2,
					mechanics,
                    BreakdownTypes.MECHANICAL,
                    spareParts);
        } catch (Exception e){System.out.println("Error: " + e);}
    }
    public static void formalizePayment (){
        System.out.println("\nPayment formalized correctly: "+repair.price(350, repair.getDate()));
    }
    public static void deleteVehicle(){
        try{
            vehiculo1 = null;
			Vehicle.count -= 1;
            System.out.println("\nVehiculo1 sucessfully deleted.");
        } catch (Exception e){
            System.out.println("\nFailure during deletion of vehiculo1.");
        }
    }
    public static void vehicleAmount(){
        System.out.println("\nNumber of vehicles: "+ Vehicle.count);
    }
    public static void repairInfo(){
        System.out.printf("""
                    \nObject created sucessfully:
                        - Fecha: %s
                        - Descripción: %s
                        - vehiculo: %s
                        - Mechanico: %s
                        - Fallo: %s
                        - Piezas: %s
                    """, repair.getDate(), repair.getDescription(), repair.getVehicle().toString(),
                repair.getMechanics().toString(), repair.getBreakdownType(), repair.getSpareParts());
    }
}