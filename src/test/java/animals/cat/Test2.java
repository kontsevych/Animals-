package animals.cat;

import animals.AbstractAnimalTest;
import animals.Animal;
import animals.Cat;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 extends AbstractAnimalTest {

    @Test
    public void testCatRunDefault() {
        double weight = 1;
        double time = getTimeOfDistance(weight, Animal.DEFAULT_DISTANCE_RUN);

        Cat shredingerCat = new Cat(weight);
        Assert.assertEquals(shredingerCat.run(), time);
    }

    @Test
    public void testCatRunDistance() {
        int distance = 1;
        double weight = 1;
        double time = getTimeOfDistance(weight, distance);

        Cat shredingerCat = new Cat(weight);
        Assert.assertEquals(shredingerCat.run(distance), time);
    }

    @Test
    public void testCatRunDistanceExceptionDistance() {
        int count = 0;
        double weight = 10;
        String codeException = " ";
        String standardException = " ";

        Cat cat = new Cat(weight);
        try {
            cat.run(count);
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
    public void testCatRunDistanceExceptionWeight() {
        int count = 100;
        double weight = 0;
        String codeException = " ";
        String standardException = " ";

        Cat cat = new Cat(weight);
        try {
            cat.run(count);
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

