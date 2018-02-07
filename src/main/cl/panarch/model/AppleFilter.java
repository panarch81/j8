package main.cl.panarch.model;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppleFilter {

    public static List<Apple> filterHeavyApples(List<Apple> inventory) throws ApplesInventoryException {
        List<Apple> result = new ArrayList<>();

        try {
            if (!inventory.isEmpty()) {
                for (Apple apple : inventory) {
                    if (apple.getWeight() > 150) {
                        result.add(apple);
                    }
                }
            }
            else{
                throw new ApplesInventoryException("Processing an Empty Inventory");
            }
        }
        catch (Exception e ){
            throw new ApplesInventoryException(e);
        }
        return result;
    }

    public static List<Apple> filterGreenApples(List<Apple> inventory){
        List<Apple> result = new ArrayList<Apple>();

        for ( Apple apple : inventory ){
            if( "green".equals(apple.getColor()) ){
                result.add(apple);
            }
        }
        return result;
    }

    public static void prettyPrintApple(List<Apple> inventory, AppleFancyFormatter appleFormatter){

        for(Apple a : inventory){
            System.out.println(appleFormatter.accept(a));
        }

    }

    public static List<Apple> arrangeAppleInventory(List<Apple> inventory) {
        AppleSort appleSort = new AppleSort();
        Collections.sort(inventory, appleSort);
        System.out.println(inventory);
        return inventory;
    }


    public static List<Apple> filterApples(List<Apple> appleInventory, ApplePredicate applePredicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : appleInventory){
            if (applePredicate.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
}
