package animals;

public class Dog extends Animal
{
    public final static String BARK = "ГАВ!";

    public Dog()
    {
        setVoice(BARK);
    }

    public Dog(double weight)
    {
        setWeight(weight);
        setVoice(BARK);
    }

}
