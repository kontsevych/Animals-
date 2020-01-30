package animals;

public class Cat extends Animal {
    public final static String MEOW = "Я сказав МЯВ!";

    public Cat(double weight, String name) {
        setWeight(weight);
        setVoice(MEOW);
        setName(name);
    }

    public Cat() {
        setWeight(10);
        setVoice(MEOW);
        setName("Мурчик");
    }

    public Cat(String name) {
        setWeight(10);
        setVoice(MEOW);
        setName(name);
    }

}
