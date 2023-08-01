package org.java.lessons.vehicles;

public class Motorcycle extends Vehicle{

    // FIELDS
    protected boolean hasStand;


    // CONSTRUCTORS
    public Motorcycle(String licencePlate, int registrationYear, boolean hasStand) {
        super(licencePlate, registrationYear);
        this.hasStand = hasStand;
    }


    // GETTERS
    public boolean isHasStand() {
        return hasStand;
    }


    // METHODS
    @Override
    public String toString() {
        return super.toString() +
                " hasStand=" + hasStand +
                ' ';
    }
}
