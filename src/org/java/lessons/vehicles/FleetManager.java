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
    public void addVehicle(Vehicle vehicle) throws DuplicateLicencePlateException{
        for (Vehicle v : vehicles){
            if (v.getLicencePlate().equalsIgnoreCase(vehicle.getLicencePlate())){
                throw new DuplicateLicencePlateException("Licence plate is already present.");
            }
        }
        vehicles.add(vehicle);
    }

    public void countVehicles(){
        int automobileCount = 0;
        int motorcycleCount = 0;
        for (Vehicle vehicle : vehicles){
            if (vehicle instanceof Automobile){
                automobileCount += 1;
            } else if (vehicle instanceof Motorcycle){
                motorcycleCount += 1;
            }
        }
        System.out.println("Automobiles in fleet: " + automobileCount);
        System.out.println("Motorcycles in fleet: " + motorcycleCount);
    }

    public void findVehicle(String licencePlate){
        for (Vehicle vehicle : vehicles){
            if (licencePlate.equalsIgnoreCase(vehicle.getLicencePlate())){
                System.out.println("Found: " + vehicle);
            }
        }
        System.out.println("Not found");
    }

    @Override
    public String toString() {
        return "FleetManager{" +
                "vehicles=" + vehicles +
                '}';
    }
}
