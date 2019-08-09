package animals;

import java.util.ArrayList;

public class Kennel {

    ArrayList<Object> animal = new ArrayList<Object>();

    Dog dog = new Dog(10);
    Dog dog2 = new Dog(10);
    Dog dog3 = new Dog(10);
    Cat cat = new Cat(10);



    public void getAnimal() {
        animal.add(dog);
        animal.add(dog2);
        animal.add(dog3);
        animal.add(cat);
//Додати ще два лісти
        for(Object i:animal ){
            if (i.getClass() == dog.getClass()){

            }
        }
        System.out.println(animal.get(1).getClass());
    }

    int size = animal.size();

    public static void main(String[] args) {
        Kennel kennel = new Kennel();

        kennel.calsss();
    }

}
