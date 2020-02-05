package animals.kennel;

import animals.Animal;
import animals.Cat;
import animals.Dog;
import animals.Kennel;
import exception.KennelExceptions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Test2 {


    @Test
    public void testAddDog() throws KennelExceptions {

        Kennel kennel = new Kennel();

        kennel.addAnimal(new Dog());

        for (Animal animal : kennel.getDogs()) {
            Assert.assertEquals(Dog.class, animal.getClass());
        }

    }

    @Test
    public void testAddCat() throws KennelExceptions {

        Kennel kennel = new Kennel();

        kennel.addAnimal(new Cat());

        for (Animal animal : kennel.getCats()) {
            Assert.assertEquals(Cat.class, animal.getClass());
        }
    }

}
