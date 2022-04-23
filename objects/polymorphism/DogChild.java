package objects.polymorphism;

public class DogChild extends PetParent {
    
    private String race;

    public DogChild(String race) {
        super("Dog");
        this.race = race;
    }

    @Override
    public void makeNoise() {
        log("Wuff...");
    }

    public String getRace() {
        return this.race;
    }

    public void setRace(String race) {
        this.race = race;
    }

}
