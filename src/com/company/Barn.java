package com.company;

import java.util.Scanner;

public class Barn {
    private FarmAnimal[] fA;

    public Barn(int max) {
        fA = new FarmAnimal[max];

    }

    public void addAnimalsInArray(FarmAnimal farmAnimal) {
        for (int i = 0; i < fA.length; i++) {
            if (fA[i] == null) {
                fA[i] = farmAnimal;
                i = fA.length;
            }
        }
    }

    public int countAnimal() {
        int count = 0;
        for (int i = 0; i < fA.length; i++) {
            if (fA[i] != null) {
                count++;
            }
        }
        return count;
    }

    public void addAnimal() {
        Scanner input = new Scanner(System.in);
        if (countAnimal() < fA.length) { // check if there is some place left in the barn
            System.out.println("Which animal do you want to add? select the following choice");
            System.out.println("Cow or Sheep?");
            String newAnimal = input.nextLine();
            System.out.println("type the animal name");
            String name = input.nextLine();
            // check if input string is same as "sheep" ignoring case
            if (newAnimal.equalsIgnoreCase("sheep")) {
                addAnimalsInArray(new Sheep(name));
                //addAnimalsInArray(new Sheep());

                // check if input string is same as "cow" ignoring case
            } else if (newAnimal.equalsIgnoreCase("cow")) {
                addAnimalsInArray(new Cow(name));
                //addAnimalsInArray(new Cow());
            } else {
                System.out.println("you can add only Cow or Sheep");
            }
            System.out.printf("%d places left%n", (fA.length - countAnimal())); // checking number of places left in Barn
        } else {
            System.out.println("BARN IS FULL\nYou can't add any more animal\nYou can select only 2 or 3");
        }
    }


    public FarmAnimal[] getFarmAnimal() { //get an array of animals in the Barn at moment
        FarmAnimal[] bA = new FarmAnimal[countAnimal()];
        int j = 0;
        for (int i = 0; i < bA.length; i++) {
            if (fA[i] != null) {
                bA[j] = fA[i];
                j++;
            }
        }
        return bA;
    }
}

