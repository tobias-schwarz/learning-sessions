package objects.inheritance;

public class Dog extends Pet {
    
    public String race;

    public Dog(String race) {
        super("Dog");
        this.race = race;
    }

    @Override
    public void makeNoise() {
        System.out.println("Wuff...");
    }

}
