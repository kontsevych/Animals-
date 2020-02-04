package animals;

public class Dog extends Animal {
    public final static String DEFAULT_BARK = "ГАВ! Курва, я тобі не платіжка за газ! ";
    public final static String DEFAULT_NAME = "Брівко>";
    public final static double DEFAULT_WEIGHT = 5;


    public Dog(double weight, String name, String voice) {
        setWeight(weight);
        setName(name);
        setVoice(voice);
    }

    public Dog(double weight, String name) {
        this(weight, name, DEFAULT_BARK);
    }

    public Dog(String name) {
        this(DEFAULT_WEIGHT, name, DEFAULT_BARK);
    }

    public Dog(double weight) {
        this(weight, DEFAULT_NAME, DEFAULT_BARK);
    }

    public Dog() {
        setWeight(DEFAULT_WEIGHT);
        setVoice(DEFAULT_BARK);
        setName(DEFAULT_NAME);
    }

}
