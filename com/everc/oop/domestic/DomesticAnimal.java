package com.everc.oop.domestic;

import com.everc.oop.Animal;

public abstract class DomesticAnimal extends Animal {

    protected String name;

    public DomesticAnimal(String name) {
        this.name = name;
    }

    public DomesticAnimal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat(){
        System.out.println("Domestic animal eat");
    }

    @Override
    public String toString() {
        return "DomesticAnimal{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
