package animals;

import java.util.ArrayList;

/**
 * * 1. Сервіс "будка". У неї можна додавати собак та котів.
 * * 2. Будка може повертати всіх котів, всіх собак, повертати всіх.
 * 3. Будка повертає всіх тварин з однаковим ім’ям.
 */
public class Kennel extends Animal {
    public final static String GET_DOGS_EXCEPTION = "There is not dogs in the kennel. \nTry to add dogs and than use this method.";
    public final static String GET_CATS_EXCEPTION = "There is not cats in the kennel. \nTry to add dogs and than use this method.";
    private ArrayList<Animal> kennel = new ArrayList<Animal>();

    public void addAnimal(Animal animal) {
        kennel.add(animal);
    }

    public ArrayList<Animal> getAnimals(Class animal) {
        ArrayList<Animal> animals = new ArrayList<Animal>();

        for (Animal animalContainer : kennel) {
            if (animalContainer.getClass() == Dog.class) {
                animals.add((Dog) animalContainer);
            } else if (animalContainer.getClass() == Cat.class) {
                animals.add((Cat) animalContainer);
            }
            throw new IllegalArgumentException("Can't find Animal" + animal);
        }
        return animals;
    }

    public ArrayList<Dog> getDogs() throws NullPointerException {
        ArrayList<Dog> dogs = new ArrayList<Dog>();

        for (Animal dogContainer : kennel) {
            if (dogContainer.getClass() == Dog.class) {
                dogs.add((Dog) dogContainer);
            }
        }
        if (dogs.isEmpty()) {
            throw new NullPointerException(GET_DOGS_EXCEPTION);
        }
        return dogs;
    }

    public ArrayList<Cat> getCats() throws NullPointerException {
        ArrayList<Cat> cats = new ArrayList<Cat>();

        for (Animal catContainer : kennel) {
            if (catContainer.getClass() == Cat.class) {
                cats.add((Cat) catContainer);
            }
        }
        if (cats.isEmpty()) {
            throw new NullPointerException(GET_CATS_EXCEPTION);
        }
        return cats;
    }

    public ArrayList<Animal> getAllPets() {
        return kennel;
    }

    public Animal getAnimalByName(String name) {

        Animal animal = null;

        for (Animal container : getAllPets()) {
            if (container.getAnimalName() == name) {
                animal = container;
            }
        }

        if (animal == null) {
            throw new IllegalArgumentException("Can't find animal with such name: " + name);
        }
        return animal;
    }

    public ArrayList<Animal> getAnimalsByName(String name) {
        ArrayList<Animal> returnList = new ArrayList<Animal>();

        for (Animal container : getAllPets()) {
            if (container.getAnimalName() == name) {
                returnList.add(container);
            }
        }
        if (returnList.size() == 0) {
            throw new IllegalArgumentException("Can't find animal with such name");
        }
        return returnList;
    }

}
