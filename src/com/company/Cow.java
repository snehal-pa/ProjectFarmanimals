package com.company;

public class Cow extends FarmAnimal {
    public Cow(){
        setNoise("Muuu");
    }
    public Cow(String name){
        super(name);
        setNoise("muuu");
    }


    @Override
    public String toString(){
        return String.format("%s a Cow(name:%s) which says \"%s\"",super.toString(),name,noise());
    }
}
