import java.util.Map;
import java.util.Scanner;

public class VirtualPetShelterApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualPetShelter virtualPetShelter = new VirtualPetShelter();
        VirtualPet myVirtualPet = new VirtualPet();

        System.out.println("Welcome to DinoCare Co.");
        //ascii attempt 2 - no escape characters
        System.out.println("               __           ");
        System.out.println("              / _)          ");
        System.out.println("     _.----._/ /            ");
        System.out.println("    /         /             ");
        System.out.println(" __/ (  | (  |              ");
        System.out.println("/__.-'|_|--|_|              ");
        System.out.println("≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈≈");
        System.out.println("To Start Press the Return key:");


        //game loop start
        VirtualPet petInShelter;
        String name;
        String userSelection = input.nextLine();
        while (!userSelection.equals("5")) {

            System.out.println("Please select from the menu below");
            System.out.println("Press 1 to check hunger, thirst, boredom, rest, and if they have to go to the bathroom");
            System.out.println("Press 2 to hydrate");
            System.out.println("Press 3 to feed");
            System.out.println("Press 4 to play");
            System.out.println("Press 5 to exit");
            userSelection = input.nextLine();


            switch (userSelection) {
                case "1":
                    System.out.println("Checking hunger, thirst, and boredom");
                    System.out.println("Who would you like to check on?");
                    name = input.nextLine();
                    petInShelter = virtualPetShelter.showOnePet(name);
                    System.out.println(petInShelter.getName() + "'s status is: " +
                            "\n hunger: " + myVirtualPet.getHunger() +
                            "\n thirst: " + myVirtualPet.getThirst() +
                            "\n boredom: " + myVirtualPet.getBoredom());
                    myVirtualPet.tick();
                    break;

                case "2":
                    System.out.println("Who would you like get some water?");
                    name = input.nextLine();
                    petInShelter = virtualPetShelter.showOnePet(name);
                    System.out.println("Let's get " + petInShelter + " some water.");
                    System.out.println("How much do you want to give them?");
                    int water = input.nextInt();
                    myVirtualPet.hydrate(water);
                    System.out.println(petInShelter + " is happy and hydrated! Thirst is now at " + myVirtualPet.getThirst());
                    myVirtualPet.tick();
                    input.nextLine();
                    break;

                case "3":
                    System.out.println("Who would you like to give food to?");
                    name = input.nextLine();
                    petInShelter = virtualPetShelter.showOnePet(name);
                    System.out.println("You want to feed " + petInShelter + "?");
                    System.out.println("How many snacks? ");
                    int snacks = input.nextInt();
                    myVirtualPet.feed(snacks);
                    System.out.println(petInShelter + "'s belly is happy! Hunger is now at " + myVirtualPet.getHunger());
                    myVirtualPet.tick();
                    input.nextLine();
                    break;

                case "4":
                    System.out.println("Who would you like to play with?");
                    name = input.nextLine();
                    petInShelter = virtualPetShelter.showOnePet(name);
                    System.out.println("You want to play with " + petInShelter + "?");
                    System.out.println("How many toys are you using? ");
                    int numberOfToys = input.nextInt();
                    myVirtualPet.play(numberOfToys);
                    System.out.println(petInShelter + " is happy! Boredom is now at " + myVirtualPet.getBoredom());
                    myVirtualPet.tick();
                    input.nextLine();
                    break;

                case "6":
                    //add pet to shelter
                    onboardPet(input, virtualPetShelter);
                    input.nextLine();
                    break;

                case "7":
                    //list all pets
                    showPets(virtualPetShelter);
                    input.nextLine();
                    break;

                case "8":
                    //a pet gets adopted and is removed from shelter
                    adoptPet(input, virtualPetShelter);
                    input.nextLine();
                    break;

               /* case "9":
                    //Feed all pets
                    System.out.println("How much food would you like to give everyone? ");
                    int snack = input.nextInt();
                    virtualPetShelter.feedAll(snack);
                    input.nextLine();
                    break;*/


                default:
                    System.out.println("You cannot perform that action at this time");
                    input.nextLine();

            }

        }
        name = input.nextLine();
        petInShelter = virtualPetShelter.showOnePet(name);
        System.out.println(petInShelter + " say's thank you for playing. See you soon! Bye!");

    }



    public static void onboardPet(Scanner input, VirtualPetShelter virtualPetShelter) {
        System.out.println("What's the Pet's Name?");
        String name = input.nextLine();
        System.out.println("What's it like?");
        String description = input.nextLine();
        System.out.println("Thank you for your submission " + " we will be sure to take good care of " + name);
        VirtualPet myVirtualPet = new VirtualPet(name, description);
        virtualPetShelter.onboardPet(myVirtualPet);
    }


    //load with interface
    public static void showPets(VirtualPetShelter virtualPetShelter) {
        for (Map.Entry<String, VirtualPet> entry : virtualPetShelter.showAllPets().entrySet()) {
            VirtualPet pet = entry.getValue();
            System.out.println(pet.getName() + " : " + pet.getDescription());

        }
    }

    public static void adoptPet(Scanner input, VirtualPetShelter virtualPetShelter) {
        System.out.println("What's the Pet's Name?");
        String name = input.nextLine();
        virtualPetShelter.adoptPet(name);
        System.out.println("You Adopted " + name);
    }

    //get pet name method
}

