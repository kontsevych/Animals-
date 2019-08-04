package animals;

public class Cat extends Animal
{

    public final static String MEOW = "Я сказав МЯВ!";

    public Cat()
    {
        setVoice(MEOW);
    }

    public Cat(double weight)
     {
         setWeight(weight);
         setVoice(MEOW);
     }

}
