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
        System.out.println("Choose option: 1-Enter program 2-Exit");
        String choice = scan.nextLine();
        boolean exit = false;

        switch (choice){
            case "1":
                System.out.println("Entering program");
                while (!exit){
                    System.out.println("Choose option: 1-Add automobile 2-Add motorcycle 3-Find vehicle 4-Exit");
                    String methodChoice = scan.nextLine();

                    if (methodChoice.equals("1")){
                        System.out.println("You chose add automobile.");
                        System.out.print("Enter licence plate: ");
                        String licencePlate = scan.nextLine();
                        System.out.print("Enter registration year: ");
                        int registrationYear = Integer.parseInt(scan.nextLine());
                        Automobile automobile = new Automobile(licencePlate, registrationYear);
                        System.out.println(automobile);
                        vehicles.addVehicle(automobile);

                    } else if (methodChoice.equals("2")){
                        System.out.println("You chose add motorcycle.");
                        System.out.print("Enter licence plate: ");
                        String licencePlate = scan.nextLine();
                        System.out.print("Enter registration year: ");
                        int registrationYear = Integer.parseInt(scan.nextLine());
                        Motorcycle motorcycle = new Motorcycle(licencePlate, registrationYear);
                        System.out.println(motorcycle);
                        vehicles.addVehicle(motorcycle);

                    } else if (methodChoice.equals("3")){
                        System.out.println("Enter licence plate: ");
                        String licencePlate = scan.nextLine();
                        vehicles.findVehicle(licencePlate);

                    } else if (methodChoice.equals("4")){
                        System.out.println("Closing program.");
                        exit = true;

                    } else {
                        System.out.println("Invaild choice.");
                    }
                }
                break;

            case "2":
                System.out.println("Closing program.");
                exit = true;
                break;
        }
        scan.close();
    }
}
