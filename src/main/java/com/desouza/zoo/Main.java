package main.java.com.desouza.zoo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // for getting input
        Scanner keyboard = new Scanner(System.in);

        // for loop continuation - 1 represents true
        int continueOuterLoop = 1;
        int continueInnerLoop = 1;

        // for menu choice
        int menuChoice = 1;

        do {
            switch (animalChoiceMenu(keyboard)) {
                case 1:
                    do {
                        System.out.println("The animal which is chosen is : ");
                        switch (menuChoice) {
                            case 1:
                                break;

                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.print("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while (continueInnerLoop == 1);

                    break;
                case 2:
                    do {
                        System.out.print("The animal which is chosen is : ");
                        switch (menuChoice) {
                            case 1:
                                break;

                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.print("Continue with this animal ? (Enter 1 for yes/ 2 for no): ");
                        continueInnerLoop = keyboard.nextInt();
                    } while (continueInnerLoop == 1);
                    break;

                default:
                    System.out.println("Sorry no such animal available.");
            }

            System.out.print("Continue main Zoo menu? (Enter 1 for yes/ 2 for no): ");
            continueOuterLoop = keyboard.nextInt();

        } while (continueOuterLoop == 1);
    }

    private static int animalChoiceMenu(Scanner keyboard) {
        int choiceGivenByUser;

        System.out.println("******* ZOO ANIMAL choice menu ******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");

        System.out.print("Enter choice of animal: ");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;
    }

    private static int animalDetailsManipulationMenu(Scanner keyboard, Animal animal) {
        int choiceGivenByUser;

        System.out.println("******* ANIMAL details menu for: " + animal.getNameOfAnimal() + " ******");
        System.out.println("1. Set properties");
        System.out.println("2. Display properties");
        System.out.println("3. Display movement");
        System.out.println("4. Display eating");

        System.out.print("Enter choice (1-4): ");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;

    }
}
