package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Barn barn = null;
        Scanner in = new Scanner(System.in);
        int maxAnimals;
        boolean start = true;
        boolean cont = true;
        do {
            try {
                System.out.println("How many animals in total do you want in the barn?");
                maxAnimals = in.nextInt();
                barn = new Barn(maxAnimals);
                start = false;

            } catch (InputMismatchException e) {
                in.nextLine();
                System.out.println("Enter correct input");
            }
        } while (start);

        while (cont) {
            try {
                menu();
                int choice = in.nextInt();
                switch (choice) {
                    case 1:
                        barn.addAnimal();
                        break;
                    case 2:
                        for (FarmAnimal fa : barn.getFarmAnimal()) {
                            System.out.println(fa);
                        }
                        break;
                    case 3:
                        cont = false;
                        break;
                    default:
                        System.out.println("Wrong choice,Enter correct choice");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.printf("Exception: %s%n", e);
                in.nextLine();
                System.out.println("Enter correct input");
            }
        }
    }

    public static void menu() {
        System.out.println("What kind of operation do you want to perform?");
        System.out.println("1. Add Animal\n2. Hear the noise of animals in Barn\n3. Quit\n");

    }

//    public static void addAnimal(Barn b, int maxAnimal) {
//        if (b.countAnimal() < maxAnimal) {
//            Scanner input = new Scanner(System.in);
//            System.out.println("Which animal do you want to add? select the following choice");
//            System.out.println("Cow or Sheep?");
//            String newAnimal = input.nextLine();
//            System.out.println("type the animal name");
//            String name = input.nextLine();
//            if (newAnimal.equalsIgnoreCase("sheep")) {
//                b.addAnimals(new Sheep(name));
//            } else if (newAnimal.equalsIgnoreCase("cow")) {
//                b.addAnimals(new Cow(name));
//            } else {
//                System.out.println("you can add only Cow or Sheep");
//            }
//
//        }else{
//            System.out.println("BARN IS FULL");
//        }
//    }


}


