package com.everc.oop.wild;

public class Wolf extends WildAnimal {

    @Override
    public void makeSound() {
        System.out.println("Wolf sound!");
    }

    @Override
    public String toString() {
        return "Wolf{} " + super.toString();
    }
}
