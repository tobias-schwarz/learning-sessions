package objects.inheritance;

public class Pet {
    
    public String type;

    public Pet(String type) {
        this.type = type;
    }

    public void makeNoise() {
        System.out.println("Noise...");
    }

}
