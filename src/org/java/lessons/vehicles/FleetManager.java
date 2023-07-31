package org.java.lessons.vehicles;

/*
Creare la gerarchia di classi necessarie e una classe GestoreFlotta che conterrà una lista di veicoli.
La classe GestoreFlotta deve permettere di:
aggiungere nuovi veicoli alla flotta
contare quanti veicoli ci sono di un determinato tipo (automobile o motocicletta)
trovare un veicolo specifico tramite il numero di targa
 */

import java.util.ArrayList;

public class FleetManager {

    ArrayList<Vehicle> vehicles = new ArrayList<>();

    // METHODS
    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    public void findVehicle(String licencePlate){
        for (Vehicle vehicle : vehicles){
            if (licencePlate.equalsIgnoreCase(vehicle.licencePlate)){
                System.out.println("Found: " + vehicle);
            } else{
                System.out.println("Vehicle not found.");
            }
        }
    }


    @Override
    public String toString() {
        return "FleetManager{" +
                "vehicles=" + vehicles +
                '}';
    }
}
