package animals.kennel;

import animals.Animal;
import animals.Cat;
import animals.Dog;
import animals.Kennel;
import exception.KennelExceptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test4 {

    @Test
    public void testGetAnimalsByClass() throws KennelExceptions {
        Kennel kennel = new Kennel();

        kennel.addAnimal(new Dog());
        kennel.addAnimal(new Cat());
        kennel.addAnimal(new Cat());

        if (kennel.getAnimalsByClass(Dog.class).size() == 1) {
            for (Animal dog : kennel.getAnimalsByClass(Dog.class)) {
                Assert.assertEquals(dog.getClass(), Dog.class);
            }
        }
        if (kennel.getAnimalsByClass(Cat.class).size() == 2) {
            for (Animal cat : kennel.getAnimalsByClass(Cat.class)) {
                Assert.assertEquals(cat.getClass(), Cat.class);
            }
        }

    }

    @Test
    public void testGetAnimalsByClassException() throws KennelExceptions {
        Kennel kennel = new Kennel();

        try {
            kennel.getAnimalsByClass(Kennel.class);
        } catch (KennelExceptions e) {
            Assert.assertEquals(Kennel.GET_ANIMAL_BY_CLASS_EXCEPTION, e.toString());
        }

    }
}
