package animals.kennel;

import animals.Cat;
import animals.Dog;
import animals.Kennel;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Test1 {

    @Test
    public void testAddAnimal() {
        Dog dog = new Dog(10, "Doom");
        Cat cat = new Cat(5, "Sony");
        Dog dog1 = new Dog(10, "Doom1");
        Cat cat1 = new Cat(5, "Sony1");
        Dog dog2 = new Dog(10, "Doom2");
        Cat cat2 = new Cat(5, "Sony2");

        Kennel kennel = new Kennel();
        ArrayList<Object> testKennel = new ArrayList<Object>();

        testKennel.add(dog);
        testKennel.add(dog1);
        testKennel.add(dog2);
        testKennel.add(cat);
        testKennel.add(cat1);
        testKennel.add(cat2);

        kennel.addAnimal(dog);
        kennel.addAnimal(dog1);
        kennel.addAnimal(dog2);
        kennel.addAnimal(cat);
        kennel.addAnimal(cat1);
        kennel.addAnimal(cat2);

        
    }
}
