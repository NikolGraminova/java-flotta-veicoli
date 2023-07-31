package org.java.lessons.vehicles;

/*
Si vuole progettare un’applicazione in grado di gestire una flotta di veicoli.
Descrizione:
Hai ricevuto l’incarico di sviluppare un’applicazione Java per la gestione di una flotta di veicoli.
Ogni veicolo nella flotta può essere di due tipi: automobile o motocicletta.
Ogni veicolo ha un numero di targa univoco e un anno di immatricolazione.
Le automobili hanno un campo per indicare il numero di porte, mentre le motociclette hanno un campo per indicare se sono dotate di cavalletto o meno.
Deve essere possibile visualizzare tutte le informazioni di ciascun tipo di veicolo.
 */

public abstract class Vehicle {


    // FIELDS
    String licencePlate;
    int registrationYear;


    // CONSTRUCTORS
    public Vehicle(String licencePlate, int registrationYear) {
        this.licencePlate = licencePlate;
        this.registrationYear = registrationYear;
    }


    // METHODS
    @Override
    public String toString() {
        return "Vehicle{" +
                "licencePlate='" + licencePlate + '\'' +
                ", registrationYear=" + registrationYear +
                '}';
    }
}
