package com.everc.oop.wild;

import com.everc.oop.IFly;

public class Falcon extends WildAnimal implements IFly {

    @Override
    public void makeSound() {
        System.out.println("Falcon sound!");
    }

    @Override
    public void fly() {
        System.out.println("Falcon fly!");
    }

    @Override
    public String toString() {
        return "Falcon{} " + super.toString();
    }
}
