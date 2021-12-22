import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    private Map<String, VirtualPet> petsInShelter = new HashMap<>();

    public void onboardPet(VirtualPet petIntake) {
        petsInShelter.put(petIntake.getName(), petIntake);
    }

    public void adoptPet(String name) {
        petsInShelter.remove(name);
    }


    public Map<String, VirtualPet> showAllPets() {
        return petsInShelter;
    }

    public VirtualPet showOnePet(String name) {
        return petsInShelter.get(name);
    }



}
