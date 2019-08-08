package animals.kennel;

import animals.AbstractAnimalTest;
import animals.Cat;
import animals.Dog;
import animals.Kennel;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.InvalidObjectException;
import java.util.ArrayList;

public class Test1 extends AbstractAnimalTest {

    @Test
    public void testAddAnimal() {

        Dog dog = new Dog(10, "Donamom");
        Cat cat = new Cat(5, "Sony");
        Dog dog2 = new Dog(10, "Doom2");
        Cat cat2 = new Cat(5, "Sony2");

        Kennel kennel = new Kennel();
        ArrayList<Object> testKennel = new ArrayList<Object>();

        testKennel.add(dog);
        testKennel.add(dog2);
        testKennel.add(cat);
        testKennel.add(cat2);

        kennel.addAnimal(dog);
        kennel.addAnimal(dog2);
        kennel.addAnimal(cat);
        kennel.addAnimal(cat2);

        System.out.println(kennel);

        Assert.assertEquals(kennel.getSize(), testKennel.size());
    }

    @Test
    public void testAddAnimalException() {
        String kennelExceptionContainer = null;
        String testKennelExceptionContainer = null;

        Dog dog = new Dog(10, "Donamom");
        Cat cat = new Cat(5, "Sony");
        Dog dog2 = new Dog(10, "Doom2");
        Cat cat2 = new Cat(5, "Sony2");

        Kennel kennel = new Kennel();
        ArrayList<Object> testKennel = new ArrayList<Object>();

        testKennel.add(dog);
        testKennel.add(dog2);
        testKennel.add(cat);
        testKennel.add(cat2);

        kennel.addAnimal(dog);
        kennel.addAnimal(dog2);
        kennel.addAnimal(cat);
        kennel.addAnimal(cat2);

        try {
            kennel.returnAnimal(kennel);

        } catch (InvalidObjectException e) {
            kennelExceptionContainer = e.getMessage();
        }

        try {
            returnAnimal(kennel, testKennel);
        } catch (InvalidObjectException e) {
            testKennelExceptionContainer = e.getMessage();
        }

        Assert.assertEquals(kennelExceptionContainer, testKennelExceptionContainer);
    }

    @Test
    public void testGetAnimals() {
        Dog dog = new Dog(10, "Donamom");
        Cat cat = new Cat(5, "Sony");
        Dog dog2 = new Dog(10, "Doom2");
        Cat cat2 = new Cat(5, "Sony2");

        Kennel kennel = new Kennel();
        ArrayList<Object> testKennel = new ArrayList<Object>();

        testKennel.add(dog);
        testKennel.add(dog2);
        testKennel.add(cat);
        testKennel.add(cat2);

        kennel.addAnimal(dog);
        kennel.addAnimal(dog2);
        kennel.addAnimal(cat);
        kennel.addAnimal(cat2);

        System.out.println(kennel);

        Assert.assertEquals(kennel.getSize(), testKennel.size());
    }
}
