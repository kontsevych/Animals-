package animals;

import java.io.InvalidObjectException;
import java.util.ArrayList;

/**
 * * 1. Сервіс "будка". У неї можна додавати собак та котів.
 * * 2. Будка може повертати всіх котів, всіх собак, повертати всіх.
 * 3. Будка повертає всіх тварин з однаковим ім’ям.
 */
public class Kennel extends Animal{
    public final String GET_DOGS_EXCEPTION = "There is not dogs in the kennel. \nTry to add dogs and than use this method.";
    public final String GET_CATS_EXCEPTION = "There is not cats in the kennel. \nTry to add dogs and than use this method.";
    private ArrayList<Object> kennel = new ArrayList<Object>();

    public void addAnimal(Dog dog) {
        kennel.add(dog);
    }

    public void addAnimal(Cat cat) {
        kennel.add(cat);
    }

    public ArrayList<Object> getDog() throws NullPointerException {
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

    public ArrayList<Object> getCat() throws NullPointerException {
        ArrayList<Object> cats = new ArrayList<Object>();

        for (Object catsContainer : kennel) {
            if (catsContainer.getClass() == Cat.class) {
                cats.add(catsContainer);
            }
        }
        if (cats.isEmpty()) {
            throw new NullPointerException(GET_CATS_EXCEPTION);
        } else {
            return cats;
        }
    }

    public ArrayList<Object> getAllPets() {
        return kennel;
    }

    public  void getAnimalByName(String name) {

        for (Object containerAnimals: getAllPets()) {
            if(containerAnimals == name) {

            }
        }


    }
}
