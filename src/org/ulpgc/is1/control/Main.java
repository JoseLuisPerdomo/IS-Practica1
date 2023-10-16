package org.ulpgc.is1.control;

import org.ulpgc.is1.model.*;


public class Main {

    public void init(RepairManager repairManager){
        Mechanic mecanico1 = new Mechanic("Pedro", "Quevedo");
        Mechanic mecanico2 = new Mechanic("José", "Perdomo");
        Vehicle vehiculo1 = new Vehicle("Ford", "Fiesta", new Plate("4517HGK"), new Costumer("Antonio el mamao", new Phone("696 69 69 69")));
        Vehicle vehiculo2 = new Vehicle("Mercedes", "Benz", new Plate("3412TDF"), new Costumer("Makeko", new Phone("131 13 13 13")));
        SparePart pieza1 = new SparePart("Tubo de escape", 32);
        SparePart pieza2 = new SparePart("Capó", 45);

    }
    public static void main(String[] args) {

    }
}