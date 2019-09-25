package com.company;

public abstract class FarmAnimal {
    protected String noise;
    protected String name;

    public FarmAnimal() {
        noise = "";
        name = "";
    }

    public FarmAnimal(String name) {

        this.name = name;
    }

    public void setNoise(String noise) {

        this.noise = noise;
    }

    public String noise() {
        return noise;
    }

    //public abstract String noise();

    @Override
    public String toString() {
        return String.format("Animal is");
    }
}
