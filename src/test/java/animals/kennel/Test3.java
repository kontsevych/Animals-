package animals.kennel;

import animals.Cat;
import animals.Dog;
import animals.Kennel;
import org.testng.annotations.Test;

public class Test3 {
    @Test
    public void testGetAnimalByName() {

        Kennel kennel = new Kennel();
        boolean result = false;

        Dog[] dog = new Dog[10];
        Cat[] cat = new Cat[10];

        for (int container = 0; container < 10; container++) {
            dog[container] = new Dog(10, "Dog" + x);
            cat[container] = new Cat(10, "Dog");
            kennel.addAnimal(dog[container]);
            kennel.addAnimal(cat[container]);

            System.out.println(dog[container].getAnimalName());
        }

        kennel.getAnimalByName("Dog");

    }
}
