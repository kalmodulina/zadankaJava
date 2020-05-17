package com.company;

public class Animal {
    public final String species;
    public String name;
    private Double weight;

    static final Double DEFAULT_DOG_WEIGHT = 11.0;
    static final Double DEFAULT_LION_WEIGHT = 180.0;
    static final Double DEFAULT_OTHER_WEIGHT = 1.0;

    public Animal(String species) {
        this.species = species;
        if (species.equals("Dog")) {
            weight = DEFAULT_DOG_WEIGHT;
        } else if (species.equals("Lion")) {
            weight = DEFAULT_LION_WEIGHT;
        } else {
            weight = DEFAULT_OTHER_WEIGHT;
        }

    }

    void feed() {
        if (weight <= 0.0) {
            System.out.println("to late for food");
        } else {
            weight += 0.1;
            System.out.println("Thx bro, my weight is now " + weight);
        }
    }

    void takeForAWalk() {
        if (weight <= 0.0) {
            System.out.println("cannot walk the town with dead animal you freak");
        } else if (weight <= 1.0) {
            System.out.println("thx for a walk but I'm hungry, my weight is now " + weight);
            weight -= 0.1;
        } else {
            System.out.println("thx for a walk, my weight is now " + weight);
            weight -= 0.1;
        }
    }

    public String toString() {
        return this.species + " " + this.name;
    }
}
