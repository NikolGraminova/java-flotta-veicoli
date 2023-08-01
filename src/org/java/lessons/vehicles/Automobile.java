package org.java.lessons.vehicles;

public class Automobile extends Vehicle{

    // FIELDS
    protected int doorsAmount;


    // CONSTRUCTORS
    public Automobile(String licencePlate, int registrationYear, int doorsAmount) {
        super(licencePlate, registrationYear);
        this.doorsAmount = doorsAmount;
    }


    // GETTERS
    public int getDoorsAmount() {
        return doorsAmount;
    }


    // METHODS
    @Override
    public String toString() {
        return super.toString() +
                " doorsAmount=" + doorsAmount +
                ' ';
    }
}
