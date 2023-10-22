package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Main {

    /*TODO
        - Formalizar el pago de la reparación anterior.
        - Borrar el primer vehículo.
        - Imprimir por pantalla el número de vehículos del taller.
        - Imprimir por pantalla toda la información de la reparación: datos generales, piezas sustituidas y el pago.
    * */

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


    public static void main(String[] args) throws ParseException {
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

            Repair repair = new Repair(
                    fecha,
                    "Cambio de capó y tubo de escape",
                    20,
                    vehiculo2,
					mechanics,
                    BreakdownTypes.MECHANICAL,
                    spareParts);
            System.out.printf("""
                    \nObject created sucessfully:
                        - Fecha: %s
                        - Descripción: %s
                        - vehiculo: %s
                        - Mechanico: %s
                        - Fallo: %s
                        - Piezas: %s
                    """, repair.getDate(), repair.getDescription(), repair.getVehicle().toString(),
                    repair.getMechanics(), repair.getBreakdownType(), repair.getSpareParts());
        } catch (Exception e){System.out.println("Error: " + e);}
    }

    public static void formalizePayment (){
        //print payment object

    }

    public static void deleteVehicle(){
        //Print object deletion
    }

    public static void vehicleAmount(){
        //Print vehicle amount
    }

    public static void repairInfo(){
        //repair
    }
}