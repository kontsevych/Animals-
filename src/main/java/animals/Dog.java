package animals;

public class Dog extends Animal {
    public final static String BARK = "ГАВ!";

    public Dog() {
        setWeight(10);
        setVoice(BARK);
        setName("Брівко");
    }

    public Dog(String name) {
        this();
        setName(name);
    }

    public Dog(double weight, String name) {
        this(name);
        setWeight(weight);
    }

}
