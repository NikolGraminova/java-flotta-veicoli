package org.java.lessons.vehicles;

/*
Aggiungere un’altra classe Main, con il metodo main nel quale viene creata un’istanza di GestoreFlotta e ne vengono testati tutti i metodi.
Può essere fatto implementando un menu interattivo usando lo Scanner oppure impostando direttamente nel codice i dati con cui costruire i vari oggetti.
BONUS 1: non deve essere possibile aggiungere 2 veicoli con la stessa targa; in questo caso il sistema deve restituire un messaggio di errore
BONUS 2: ragionare sulla classe veicolo: è necessario e ha senso che venga istanziata oppure potrebbe essere astratta?
 */

public class Main {
    public static void main(String[] args) {

        Automobile mercedes = new Automobile("NY512SZ",2015);
        Motorcycle ducati = new Motorcycle("MS231JD", 2018);
        System.out.println(mercedes);

        FleetManager vehicles = new FleetManager();
        vehicles.addVehicle(mercedes);
        vehicles.addVehicle(ducati);

        System.out.println(vehicles);
        vehicles.findVehicle("MS231JD");
    }
}
