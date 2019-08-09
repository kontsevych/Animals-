package animals;

public class Cat extends Animal {
    public final static String MEOW = "Я сказав МЯВ!";

    public Cat(double weight, String name) {
        setWeight(weight);
        setVoice(MEOW);
        setName(name);
    }

}
