package animals;

import java.io.InvalidObjectException;
import java.util.ArrayList;

/**
 * 1. Сервіс "будка". У неї можна додавати собак та котів.
 * 2. Будка може повертати всіх котів, всіх собак, повертати всіх.
 * 3. Будка повертає всіх тварин з однаковим ім’ям.
 */
public class Kennel {

    private ArrayList<Object> kennel = new ArrayList<Object>();


    public void addAnimal(Object animal) throws InvalidObjectException {
        if (animal.getClass() == Cat.class) {
            kennel.add(animal);
        } else if (animal.getClass() == Dog.class) {
            kennel.add(animal);
        } else {
            throw new InvalidObjectException("Wrong animal type");
        }
    }

    public int getSize() {
        return kennel.size();
    }

    public Object returnAnimal(Class animal) throws InvalidObjectException {
        ArrayList<Object> animals = new ArrayList<Object>();
        if (animal != Cat.class && animal != Dog.class) {
            throw new InvalidObjectException("Can't find this type of animal: " + animal);
        }
            for (Object container : kennel) {
                if (container.getClass() == animal) {
                    animals.add(container);
                }
            }
        return animals;
    }

    public Object returnAllAnimals() throws InvalidObjectException {
        return kennel;
    }
}
