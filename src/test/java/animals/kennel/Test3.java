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

        for (int x = 0; x < 10; x++) {
            dog[x] = new Dog(10, "Dog" + x);
            cat[x] = new Cat(10, "Dog");
            kennel.addAnimal(dog[x]);
            kennel.addAnimal(cat[x]);

            System.out.println(dog[x].getAnimalName());
        }

        kennel.getAnimalByName("Dog");

    }
}
