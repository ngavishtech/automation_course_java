package com.everc.oop.wild;

import com.everc.oop.Animal;

public abstract class WildAnimal extends Animal {

    protected String habitat;

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "WildAnimal{" +
                "habitat='" + habitat + '\'' +
                "} " + super.toString();
    }
}
