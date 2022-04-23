package objects.polymorphism;

public class PetParent {

    private String type;

    public PetParent(String type) {
        this.type = type;
    }

    public void makeNoise() {
        log("Noise...");
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    protected void log(String message) {
        System.out.println(message);
    }

}

