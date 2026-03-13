package main.java.com.desouza.zoo.app;

import main.java.com.desouza.zoo.model.Animal;
import main.java.com.desouza.zoo.model.Dolphin;
import main.java.com.desouza.zoo.model.Tiger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // for getting input
        Scanner keyboard = new Scanner(System.in);

        Tiger tigerObject = new Tiger();
        Dolphin dolphinObject = new Dolphin();

        // for loop continuation - 1 represents true
        int continueOuterLoop = 1;
        int continueInnerLoop = 1;

        // for menu choice
        int menuChoice = 1;
        do {
            switch (animalChoiceMenu(keyboard)) {
                case 1:
                    do {
                        System.out.println("The animal which is chosen is : " + tigerObject.getNameOfAnimal());
                        switch (animalDetailsManipulationMenu(keyboard, tigerObject)) {
                            case 1:
                                System.out.print("\nEnter the Age: ");
                                tigerObject.setAge(keyboard.nextInt());
                                System.out.print("Enter the Weight: ");
                                tigerObject.setWeight(keyboard.nextInt());
                                System.out.print("Enter the Height: ");
                                tigerObject.setHeight(keyboard.nextInt());
                                System.out.print("Enter the speed: ");
                                tigerObject.setSpeed(keyboard.nextDouble());
                                System.out.print("Enter the sound level of roar: ");
                                tigerObject.setSoundLevelOfRoar(keyboard.nextDouble());
                                break;
                            case 2:
                                System.out.println("\nAge: " + tigerObject.getAge());
                                System.out.println("Weight: " + tigerObject.getWeight());
                                System.out.println("Height: " + tigerObject.getHeight());
                                System.out.println("Speed: " + tigerObject.getSpeed());
                                System.out.println("Sound level of roar: " + tigerObject.getSoundLevelOfRoar());
                                break;
                            case 3:
                                tigerObject.walking();
                                break;
                            case 4:
                                tigerObject.eatingFood();
                                System.out.println("...........................");
                                System.out.println("...........................");
                                System.out.println("...........................");
                                tigerObject.eatingCompleted();
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
                        System.out.println("The animal which is chosen is : " + dolphinObject.getNameOfAnimal());
                        switch (animalDetailsManipulationMenu(keyboard, dolphinObject)) {
                            case 1:
                                System.out.print("\nEnter the Age: ");
                                dolphinObject.setAge(keyboard.nextInt());
                                System.out.print("Enter the Weight: ");
                                dolphinObject.setWeight(keyboard.nextInt());
                                System.out.print("Enter the Height: ");
                                dolphinObject.setHeight(keyboard.nextInt());
                                keyboard.nextLine();
                                System.out.print("Enter the Swimming speed: ");
                                dolphinObject.setSwimmingSpeed(keyboard.nextDouble());
                                keyboard.nextLine();
                                System.out.print("Enter the Dolphin's color: ");
                                dolphinObject.setColorOfDolphin(keyboard.nextLine());
                                break;
                            case 2:
                                System.out.println("\nAge: " + dolphinObject.getAge());
                                System.out.println("Weight: " + dolphinObject.getWeight());
                                System.out.println("Height: " + dolphinObject.getHeight());
                                System.out.println("Swimming Speed: " + dolphinObject.getSwimmingSpeed());
                                System.out.println("Dolphin color: " + dolphinObject.getColorOfDolphin());
                                break;
                            case 3:
                                dolphinObject.swimming();
                                break;
                            case 4:
                                dolphinObject.eatingFood();
                                System.out.println("...........................");
                                System.out.println("...........................");
                                System.out.println("...........................");
                                dolphinObject.eatingCompleted();
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
