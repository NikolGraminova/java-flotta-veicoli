package org.java.lessons.vehicles;

/*
Aggiungere un’altra classe Main, con il metodo main nel quale viene creata un’istanza di GestoreFlotta e ne vengono testati tutti i metodi.
Può essere fatto implementando un menu interattivo usando lo Scanner oppure impostando direttamente nel codice i dati con cui costruire i vari oggetti.
BONUS 1: non deve essere possibile aggiungere 2 veicoli con la stessa targa; in questo caso il sistema deve restituire un messaggio di errore
BONUS 2: ragionare sulla classe veicolo: è necessario e ha senso che venga istanziata oppure potrebbe essere astratta?
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        FleetManager vehicles = new FleetManager();

        System.out.println("*** WELCOME TO FLEET APPLICATION ***");
        boolean exit = false;
        while (!exit){
            System.out.println("Choose option: 1-Add automobile 2-Add motorcycle 3-Find vehicle 4-Count vehicles 5-Display fleet 6-Exit");
            String choice = scan.nextLine();

            switch (choice) {

                case "1" -> {
                    System.out.println("You chose add automobile.");
                    System.out.print("Enter licence plate: ");
                    String licencePlate = scan.nextLine();
                    System.out.print("Enter registration year: ");
                    int registrationYear = Integer.parseInt(scan.nextLine());
                    System.out.print("Enter doors amount: ");
                    int doorsAmount = Integer.parseInt(scan.nextLine());
                    Automobile automobile = new Automobile(licencePlate, registrationYear, doorsAmount);
                    System.out.println(automobile);
                    try {
                        vehicles.addVehicle(automobile);
                    } catch (DuplicateLicencePlateException e) {
                        System.out.println(e.getMessage());
                    }
                }

                case "2" -> {
                    System.out.println("You chose add motorcycle.");
                    System.out.print("Enter licence plate: ");
                    String licencePlate = scan.nextLine();
                    System.out.print("Enter registration year: ");
                    int registrationYear = Integer.parseInt(scan.nextLine());
                    System.out.print("Does it have a stand? (Y/N)");
                    boolean hasStand = scan.nextLine().equalsIgnoreCase("Y");
                    Motorcycle motorcycle = new Motorcycle(licencePlate, registrationYear, hasStand);
                    System.out.println(motorcycle);
                    try {
                        vehicles.addVehicle(motorcycle);
                    } catch (DuplicateLicencePlateException e) {
                        System.out.println(e.getMessage());
                    }
                }

                case "3" -> {
                    System.out.print("Enter licence plate: ");
                    String licencePlate = scan.nextLine();
                    vehicles.findVehicle(licencePlate);

                }

                case "4" -> vehicles.countVehicles();

                case "5" -> {
                    System.out.println("Displaying fleet: ");
                    System.out.println(vehicles);
                }

                case "6" -> {
                    System.out.println("Closing program.");
                    exit = true;
                }

                default -> System.out.println("Invalid choice.");
            }
        }
        scan.close();
    }
}
