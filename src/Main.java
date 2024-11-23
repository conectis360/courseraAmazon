import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tiger objectTiger = new Tiger();
        Dolphin objectDolphin = new Dolphin();
        Penguin objectPenguin = new Penguin();

        objectTiger.setNameOfAnimal("Tiger");
        objectDolphin.setNameOfAnimal("Dolphin");
        objectPenguin.setNameOfAnimal("Penguin");

        // for getting input
        Scanner keyboard = new Scanner(System.in);

        // for loop continuation - 1 represents true
        int continueOuterLoop = 1  ;
        int continueInnerLoop = 1;

        // for menu choice
        int menuChoice = 1;

        /** TODO 8: create a menu system to work with the Animal selected
         *          use the switch provided below
         **/
        do {
            switch (animalChoiceMenu(keyboard)) {
                case 1:
                    do {
                        System.out.println("The animal which is chosen is : " + objectTiger.getNameOfAnimal());
                        menuChoice = animalDetailsManipulationMenu(keyboard, objectTiger);
                        switch (menuChoice) {
                            case 1:
                                System.out.println("Enter speed: ");
                                objectTiger.setSpeed(keyboard.nextInt());
                                System.out.println("Age: ");
                                objectTiger.setAge(keyboard.nextInt());
                                System.out.println("Height: ");
                                objectTiger.setHeight(keyboard.nextInt());
                                System.out.println("Weight: ");
                                objectTiger.setWeight(keyboard.nextInt());
                                System.out.println("Stripes: ");
                                objectTiger.setNumberOfStripes(keyboard.nextInt());
                                System.out.println("Roar: ");
                                objectTiger.setSoundLevel(keyboard.nextInt());
                                break;
                            case 2:
                                System.out.println("Age: " + objectTiger.getAge());
                                System.out.println("Speed: " + objectTiger.getSpeed());
                                System.out.println("Height: " + objectTiger.getHeight());
                                System.out.println("Weight: " + objectTiger.getWeight());
                                System.out.println("Stripes: " + objectTiger.getNumberOfStripes());
                                System.out.println("Roar: " + objectTiger.getSoundLevel());
                                break;
                            case 3:
                                objectTiger.walking();
                                break;
                            case 4:
                                objectTiger.eatingFood();
                                objectTiger.eatingCompleted();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);

                    break;
                case 2:
                    do {
                        System.out.println("The animal which is chosen is : " + objectDolphin.getNameOfAnimal());

                        menuChoice = animalDetailsManipulationMenu(keyboard, objectDolphin);
                        switch (menuChoice) {
                            case 1:
                                System.out.println("Enter speed: ");
                                objectDolphin.setSwimmingSpeed(keyboard.nextInt());
                                System.out.println("Age: ");
                                objectDolphin.setAge(keyboard.nextInt());
                                System.out.println("Height: ");
                                objectDolphin.setHeight(keyboard.nextInt());
                                System.out.println("Weight: ");
                                objectDolphin.setWeight(keyboard.nextInt());
                                System.out.println("Color: ");
                                objectDolphin.setColor(keyboard.next());
                                break;

                            case 2:
                                System.out.println("Age: " + objectDolphin.getAge());
                                System.out.println("Speed: " + objectDolphin.getSwimmingSpeed());
                                System.out.println("Height: " + objectDolphin.getHeight());
                                System.out.println("Weight: " + objectDolphin.getWeight());
                                System.out.println("Color: " + objectDolphin.getColor());
                                break;
                            case 3:
                                objectDolphin.swimming();
                                break;
                            case 4:
                                objectDolphin.eatingFood();
                                objectDolphin.eatingCompleted();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);
                    break;
                case 3:
                    do {
                        System.out.println("The animal which is chosen is : " + objectPenguin.getNameOfAnimal());
                        menuChoice = animalDetailsManipulationMenu(keyboard, objectPenguin);
                        switch (menuChoice) {
                            case 1:
                                System.out.println("Age: ");
                                objectPenguin.setAge(keyboard.nextInt());
                                System.out.println("Height: ");
                                objectPenguin.setHeight(keyboard.nextInt());
                                System.out.println("Weight: ");
                                objectPenguin.setWeight(keyboard.nextInt());
                                System.out.println("Is the Penguin Swimming?");
                                objectPenguin.setSwimming(keyboard.nextBoolean());
                                System.out.println("Enter speed: ");
                                objectPenguin.setWalkSpeed(keyboard.nextInt());
                                System.out.println("Enter swimmingSpeed: ");
                                objectPenguin.setSwimSpeed(keyboard.nextInt());
                                break;
                            case 2:
                                System.out.println("Age: " + objectPenguin.getAge());
                                System.out.println("Height: " + objectPenguin.getHeight());
                                System.out.println("Weight: " + objectPenguin.getWeight());
                                System.out.println("Walking Speed: " + objectPenguin.getWalkSpeed());
                                System.out.println("Swimming Speed: " + objectPenguin.getSwimSpeed());
                                break;
                            case 3:
                                objectPenguin.walking();
                                break;
                            case 4:
                                objectPenguin.eatingFood();
                                objectPenguin.eatingCompleted();
                                break;
                            default:
                                System.out.println("Not supported");

                        }
                        System.out.println("Continue with this animal ? (Enter 1 for yes/ 2 for no):");
                        continueInnerLoop = keyboard.nextInt();
                    } while(continueInnerLoop == 1);
                    break;
                default:
                    System.out.println("Sorry no such animal available.");
            }

            System.out.println("Continue main Zoo menu? (Enter 1 for yes/ 2 for no):");
            continueOuterLoop = keyboard.nextInt();

        } while(continueOuterLoop == 1);
        /** TODO 9: create a class "Penguin" from the "Animal" class **/

        /** TODO 10: integrate the choice to pick a "penguin" in the menu system **/

    }

    private static int animalChoiceMenu(Scanner keyboard) {
        int choiceGivenByUser;

        System.out.println("******* ZOO ANIMAL choice menu ******");
        System.out.println("1. Tiger");
        System.out.println("2. Dolphin");
        System.out.println("3. Penguin");

        System.out.println("Enter choice of animal:");
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

        System.out.println("Enter choice (1-4):");
        choiceGivenByUser = keyboard.nextInt();
        return choiceGivenByUser;

    }
}



