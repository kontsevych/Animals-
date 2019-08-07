package animals.dog;

import animals.AbstractAnimalTest;
import animals.Animal;
import animals.Dog;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 extends AbstractAnimalTest {

    @Test
    public void testDogRunDefault() {
        double weight = 1;
        double time = getTimeOfDistance(weight, Animal.DEFAULT_DISTANCE_RUN);

        Dog dog = new Dog(weight, " test");

        Assert.assertEquals(dog.run(), time);
    }

    @Test
    public void testDogRunDistance() {
        int count = 10;
        double weight = 10;
        double time = getTimeOfDistance(weight, count);

        Dog dog = new Dog(weight, "test");

        Assert.assertEquals(dog.run(count), time);
    }

    @Test
    public void testDogRunDistanceExceptionDistance() {
        int count = 0;
        double weight = 10;
        String codeException = " ";
        String standardException = " ";

        Dog dog = new Dog(weight, " test");
        try {
            dog.run(count);
            Assert.fail("The distance > 0: Distance = " + count);
        } catch (IllegalArgumentException e) {

            codeException = e.getMessage();
        }
        try {
            getTimeOfDistance(weight, count);
        } catch (IllegalArgumentException e) {

            standardException = e.getMessage();
        }

        Assert.assertEquals(codeException, standardException);
    }

    @Test
    public void testDogRunDistanceExceptionWeight() {
        int count = 10;
        double weight = 0;
        String codeException = " ";
        String standardException = " ";

        Dog dog = new Dog(weight, "test");
        try {
            dog.run(count);
            Assert.fail("The weight > 0: weight = " + weight);
        } catch (IllegalArgumentException e) {
            codeException = e.getMessage();
        }
        try {
            getTimeOfDistance(weight, count);
        } catch (IllegalArgumentException e) {

            standardException = e.getMessage();
        }

        Assert.assertEquals(codeException, standardException);
    }
}
