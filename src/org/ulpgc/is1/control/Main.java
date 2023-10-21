package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;
import java.text.SimpleDateFormat;


public class Main {

    /*TODO
        + Solve problem with date format in repair class
        - Registrar una reparación que realiza el primer mecánico sobre el segundo vehículo. En esta reparación se han modificado dos piezas del vehículo, con el tipo de reparación “Mechanical”.
        - Formalizar el pago de la reparación anterior.
        - Borrar el primer vehículo.
        - Imprimir por pantalla el número de vehículos del taller.
        - Imprimir por pantalla toda la información de la reparación: datos generales, piezas sustituidas y el pago.
    * */
    public static Mechanic mecanico1;
    public static Mechanic mecanico2;
    public static Vehicle vehiculo1;
    public static Vehicle vehiculo2;
    public static SparePart pieza1;
    public static SparePart pieza2;
    public static RepairManager repairManager = new RepairManager();

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


    public static void main(String[] args) {
        init(repairManager);
        System.out.printf("""
                
                Mecánico1:
                    - Name: %s
                    - Surname: %s
                    - Repairs: %s""",
                mecanico1.getName(), mecanico1.getSurname(), mecanico1.getRepairs().toString());
        System.out.printf("""
                \n
                Vehiculo2:
                	- Make: %s
                	- Model: %s
                	- Plate: %s
                	- Owner: %s""",
                vehiculo2.getMake(), vehiculo2.getModel(), vehiculo2.getPlate().getNumber(),
                vehiculo2.getOwner().getName());
        try{
            /*Repair repair1 = new Repair(new SimpleDateFormat(2023-04-28),
                    "Cambio de capó y tubo de escape",
                    20,
                    vehiculo2,
                    mecanico1,
                    BreakdownTypes.MECHANICAL,
                    pieza1);*/
        }catch (Exception e){
            System.out.println("Error: "+e);
        }
    }
}