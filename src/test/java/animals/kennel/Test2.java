package animals.kennel;

import animals.Animal;
import animals.Cat;
import animals.Dog;
import animals.Kennel;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Test2 {


    @Test
    public void testAddDog() throws NullPointerException {

        Kennel kennel = new Kennel();

        kennel.addAnimal(new Dog());

        for (Animal animal : kennel.getDogs()) {
            Assert.assertEquals(Dog.class, animal.getClass());
        }

    }

    @Test
    public void testAddCat() throws NullPointerException {

        Kennel kennel = new Kennel();

        kennel.addAnimal(new Cat());

        for (Animal animal : kennel.getCats()) {
            Assert.assertEquals(Cat.class, animal.getClass());
        }
    }

}
