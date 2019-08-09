package animals;

public class Dog extends Animal {
    public final static String BARK = "ГАВ!";

    public Dog(double weight, String name) {
        setWeight(weight);
        setVoice(BARK);
        setName(name);
    }

}
