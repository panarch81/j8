package test.cl.panarch.model;

import main.cl.panarch.model.Apple;
import main.cl.panarch.model.AppleFilter;
import main.cl.panarch.model.ApplesInventoryException;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class AppleFilterTest {
    List<Apple> appleInventory = new ArrayList<>();
    List<Apple> emptyAppleInventory = new ArrayList<>();

    @org.junit.Before
    public void setUp() throws Exception {
        Apple apple1 = new Apple();
        apple1.setId(1);
        apple1.setColor("green");
        apple1.setWeight(151);

        Apple apple2 = new Apple();
        apple2.setId(2);
        apple2.setColor("red");
        apple2.setWeight(171);

        Apple apple3 = new Apple();
        apple3.setId(3);
        apple3.setColor("green");
        apple3.setWeight(121);

        Apple apple4 = new Apple();
        apple4.setId(4);
        apple4.setColor("green");
        apple4.setWeight(157);

        appleInventory.add(apple1);
        appleInventory.add(apple2);
        appleInventory.add(apple3);
        appleInventory.add(apple4);
        
    }

    @Test(expected = ApplesInventoryException.class)
    public void shouldLaunchApplesInventoryExceptionWhenInventoryIsEmpty() throws Exception{
        AppleFilter.filterHeavyApples(emptyAppleInventory);
    }

}