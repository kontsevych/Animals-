package animals;

import exception.KennelExceptions;

import java.util.ArrayList;

public class Kennel extends Animal {
    public final static String GET_DOGS_EXCEPTION = "There is not dogs in the kennel. \nTry to add dogs and than use this method.";
    public final static String GET_CATS_EXCEPTION = "There is not cats in the kennel. \nTry to add dogs and than use this method.";
    public final static String GET_ANIMAL_BY_NAME = "Can't find animal with such name: ";

    private ArrayList<Animal> animals = new ArrayList<Animal>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public ArrayList<Animal> getAnimals(Class animal) throws KennelExceptions {
        ArrayList<Animal> animals = new ArrayList<Animal>();

        for (Animal animalContainer : this.animals) {
            if (animalContainer.getClass() == Dog.class) {
                animals.add((Dog) animalContainer);
            } else if (animalContainer.getClass() == Cat.class) {
                animals.add((Cat) animalContainer);
            }
            throw new KennelExceptions("Can't find the animal: " + animal);
        }
        return animals;
    }

    public ArrayList<Dog> getDogs() throws KennelExceptions {
        ArrayList<Dog> dogs = new ArrayList<Dog>();

        for (Animal dogContainer : animals) {
            if (dogContainer.getClass() == Dog.class) {
                dogs.add((Dog) dogContainer);
            }
        }
        if (dogs.isEmpty()) {
            throw new KennelExceptions(GET_DOGS_EXCEPTION);
        }
        return dogs;
    }

    public ArrayList<Cat> getCats() throws KennelExceptions {
        ArrayList<Cat> cats = new ArrayList<Cat>();

        for (Animal catContainer : animals) {
            if (catContainer.getClass() == Cat.class) {
                cats.add((Cat) catContainer);
            }
        }
        if (cats.isEmpty()) {
            throw new KennelExceptions(GET_CATS_EXCEPTION);
        }
        return cats;
    }

    public ArrayList<Animal> getAllPets() {
        return animals;
    }

    public Animal getAnimalByName(String name) throws KennelExceptions {

        Animal animal = null;
        ArrayList<Animal> animals = new ArrayList<Animal>();

        for (Animal container : getAllPets()) {
            if (container.getName().equals(name)) {
                animal = container;
                animals.add(container);
            }
        }

        if (animal == null) {
            throw new KennelExceptions(GET_ANIMAL_BY_NAME + name);
        }
        if (animals.size() > 1) {
            throw new KennelExceptions("There is more than one animal with such name. Please use another method");
        }
        return animal;
    }


    public ArrayList<Animal> getAnimalsByName(String name) throws KennelExceptions {
        ArrayList<Animal> returnList = new ArrayList<Animal>();

        for (Animal container : getAllPets()) {
            if (container.getName().equals(name)) {
                returnList.add(container);
            }
        }
        if (returnList.size() == 0) {
            throw new KennelExceptions(GET_ANIMAL_BY_NAME + name);
        }
        return returnList;
    }

    public ArrayList<Animal> getDogsByName(String name) throws KennelExceptions {
        ArrayList<Animal> returnList = new ArrayList<Animal>();

        for (Animal container : getDogs()) {
            if (container.getName().equals(name)) {
                returnList.add(container);
            }
        }
        if (returnList.size() == 0) {
            throw new KennelExceptions(GET_ANIMAL_BY_NAME + name);
        }
        return returnList;
    }

}
