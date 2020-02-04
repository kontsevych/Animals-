package animals;

public class Cat extends Animal {
    public final static String DEFAULT_MEOW = "Я сказав МЯВ!";
    public final static String DEFAULT_NAME = "Мурчик";
    public final static double DEFAULT_WEIGHT = 5;


    public Cat(double weight, String name, String voice) {
        setWeight(weight);
        setName(name);
        setVoice(voice);
    }

    public Cat(double weight, String name) {
        this(weight, name, DEFAULT_MEOW);
    }

    public Cat(double weight) {
        this(weight, DEFAULT_NAME, DEFAULT_MEOW);
    }

    public Cat(String name) {
        this(DEFAULT_WEIGHT, name, DEFAULT_MEOW);
    }

    public Cat() {
        setWeight(DEFAULT_WEIGHT);
        setVoice(DEFAULT_MEOW);
        setName(DEFAULT_NAME);
    }
}
