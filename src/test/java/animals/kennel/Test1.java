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
    public void testExceptionAddAnimal() throws InvalidObjectException {
        String containerKennel = null;
        String containerTestKennel = null;

        Kennel kennel = new Kennel();
        ArrayList<Object> testKennel = new ArrayList<Object>();

        try {
            kennel.addAnimal(kennel);
        } catch (InvalidObjectException e) {
            containerKennel = e.getMessage();
            System.out.println(containerKennel);
        }

        try {
            addAnimal(kennel, testKennel);
        } catch (InvalidObjectException e) {
            containerTestKennel = e.getMessage();
            System.out.println(containerTestKennel);
        }

        Assert.assertEquals(containerKennel, containerTestKennel);
    }

    @Test
    public void testAddAnimal() throws InvalidObjectException {

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
