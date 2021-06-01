package com.everc.oop;

public abstract class Animal implements IEat {

    protected Eyes eyes;
    protected boolean isPredator;

    public boolean isPredator() {
        return isPredator;
    }

    public void setPredator(boolean predator) {
        isPredator = predator;
    }

    public Eyes getEyes() {
        return eyes;
    }

    public void setEyes(Eyes eyes) {
        this.eyes = eyes;
    }

    public abstract void makeSound();

    public void sleep() {
        System.out.println("Animal sleep!");
    }

    @Override public String toString() {
        return "Animal{" +
                "isPredator=" + isPredator +
                ", eyes=" + eyes +
                '}';
    }
}
