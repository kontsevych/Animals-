package animals.kennel;

import animals.Cat;
import animals.Dog;
import animals.Kennel;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.InvalidObjectException;

public class Test1 {

    @Test
    public void testGetDog() throws InvalidObjectException, java.lang.NullPointerException {
        Kennel kennel = new Kennel();

        //Dog[] dog = new Dog[10];
        Cat[] cat = new Cat[10];

        for (int x = 0; x < 10; x++) {
            //dog[x] = new Dog(10, "Dog");
            cat[x] = new Cat(10, "Cat");

            // kennel.addAnimal(dog[x]);
            kennel.addAnimal(cat[x]);
        }

        for (Object container : kennel.getDog()) {
            Assert.assertEquals(container.getClass(), Dog.class);
        }
    }

    @Test
    public void testExceptionGetDog() throws InvalidObjectException, java.lang.NullPointerException {
        Kennel kennel = new Kennel();
        String dogException = null;
        //Dog[] dog = new Dog[10];
        Cat[] cat = new Cat[10];

        for (int x = 0; x < 10; x++) {
            //dog[x] = new Dog(10, "Dog");
            cat[x] = new Cat(10, "Cat");

            // kennel.addAnimal(dog[x]);
            kennel.addAnimal(cat[x]);
        }
        try {
            for (Object container : kennel.getDog()) {
                Assert.assertEquals(container.getClass(), Dog.class);
            }
        } catch (NullPointerException e) {
            dogException = e.getMessage();
        }
        Assert.assertEquals(dogException, "There is not dogs in the kennel. \nTry to add dogs and than use this method.");

    }
}
