package com.company;

public class Sheep extends FarmAnimal {
    public Sheep(){
        setNoise("Bäää");
    }
    public Sheep(String name){
        super(name);
        setNoise("bäää");
    }

    /*@Override
    public String noise() {
        return noise();
    }*/
    @Override
    public String toString(){
        return String.format("%s a Sheep(name:%s) which says \"%s\"",super.toString(),name,noise());
    }
}
