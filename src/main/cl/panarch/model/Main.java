package main.cl.panarch.model;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args){
        List<Apple> appleInventory = new ArrayList<>();

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

        List<Apple> heavyApples = appleInventory.stream().filter( (Apple a) -> a.getWeight() > 150)
                .collect(Collectors.toList());
        System.out.println("Heavy Apples: "+heavyApples);

        List<Apple> greenHeavyApples = appleInventory.stream().filter( (Apple a) -> a.getWeight() > 150
                && "green".equals(a.getColor()) )
                .collect(Collectors.toList());
        System.out.println("Green Heavy Apples: "+greenHeavyApples);

        AppleFilter.arrangeAppleInventory(appleInventory);
        AppleFilter.prettyPrintApple(appleInventory, new AppleFancyFormatter());


        List<Apple> greenApples = AppleFilter.filterApples(appleInventory, new GreenApplePredicate());
        System.out.println(greenApples);

        //anonimous class
        List<Apple> redApples = AppleFilter.filterApples(appleInventory, new ApplePredicate(){
                public boolean test(Apple apple){
                    return "red".equals(apple.getColor());
                }
            });
        System.out.println(redApples);

    }



}
