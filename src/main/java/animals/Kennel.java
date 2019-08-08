package animals;

import java.io.InvalidObjectException;
import java.util.ArrayList;

/**
 * 1. Сервіс "будка". У неї можна додавати собак та котів.
 * 2. Будка може повертати всіх котів, всіх собак, повертати всіх.
 * 3. Будка повертає всіх тварин з однаковим ім’ям.
 */
public class Kennel {
    public final String GET_DOGS_EXCEPTION = "There is not dogs in the kennel. \nTry to add dogs and than use this method.";
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

    public ArrayList<Object> getDog() throws InvalidObjectException {
        ArrayList<Object> dogs = new ArrayList<Object>();

        for (Object dogsContainer : kennel) {
            if (dogsContainer.getClass() == Dog.class) {
                dogs.add(dogsContainer);
            }
        }
        if (dogs.isEmpty()) {
            throw new NullPointerException(GET_DOGS_EXCEPTION);
        } else {
            return dogs;
        }
    }

    public ArrayList<Object> getCat() throws InvalidObjectException {
        ArrayList<Object> animals = new ArrayList<Object>();
        for (Object container : kennel) {
            if (container.getClass() == Cat.class) {
                animals.add(container);
            }
        }
        return animals;
    }

    public Object returnAllAnimals() {
        return kennel;
    }
}
