public class VirtualPet {
    //instance variables
    private String description;
    private String name;
    //private String nature;
    private int hunger;
    private int thirst;
    private int boredom;
    private int rest;
    private int potty;


    //default constructor
    public VirtualPet(String name, String description) {
        this.name = name;
        this.description = description;
        this.hunger = 10;
        this.thirst = 10;
        this.boredom = 10;
        this.rest = 10;
        this.potty = 10;
    }

    public VirtualPet() {
        this.hunger = 10;
        this.thirst = 10;
        this.boredom = 10;
        this.rest = 10;
        this.potty = 10;
    }

    //setters for name and description
    public void setName(String userSelectedName) {
        name = userSelectedName;
    }

    public void setDescription(String UserSelectedDescription) {
        description = UserSelectedDescription;
    }

    //getters to return instance data
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }

    public int getRest() {
        return rest;
    }

    public int getPotty() {
        return potty;
    }


    //behavioral methods
    public boolean getWakeStatus() {
        if (hunger > 0 || thirst > 0 || boredom > 0) {
            return true;
        }
        return false;
    }

    public void feed(int food) {
        hunger += food;
    }

    public void hydrate(int water) {
        thirst += water;
    }

    public void play(int toys) {
        boredom += toys;
    }

    public void nap(int sleep) {
        rest += sleep;
    }

    public void bathrooom(int poop) {
        potty += poop;
    }


    //tick method
    public void tick() {
        hunger -= 2;
        thirst -= 2;
        boredom -= 2;
        rest -= 2;
        potty -= 2;
    }

   /* //Fail state
    public void checkGameOver(){
        if (hunger < 0 || thirst < 0 || boredom < 0){

        }
    }*/
}
