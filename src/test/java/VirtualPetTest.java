import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {
        //Arrange
        VirtualPet underTest = new VirtualPet("Theo", "Lazy");

    @Test
    public void checkHungerStatus(){
        //Act
        double hunger = underTest.getHunger();
        //Assert
        assertEquals(0, hunger);
    }

    @Test
    public void checkThirstStatus(){
        //Act
        double thirst = underTest.getThirst();
        //Assert
        assertEquals(0, thirst);
    }

    @Test
    public void checkIfPetHasPassedOutFromHunger(){
        //Act
        boolean wakePet = underTest.getWakeStatus();
        //Assert
        assertEquals(true, wakePet);
    }

    @Test
    public void checkIfPetHasPassedOutFromThirst(){
        //Act
        boolean wakePet = underTest.getWakeStatus();
        //Assert
        assertEquals(true, wakePet);
    }

    @Test
    public void feedPet(){
        //Act
        underTest.feed(3);
    }

    @Test
    public void givePetWater(int water){
        //Act
        water = 5;
        underTest.hydrate(water);
    }

}
