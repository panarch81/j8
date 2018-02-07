package main.cl.panarch.model;


import java.util.Arrays;
import java.util.List;

public class AppleFancyFormatter implements AppleFormatter{

    @Override
    public String accept(Apple apple) {
        String characteristic = apple.getWeight() > 150 ? "heavy" : "light";
        return "This is a "+ characteristic + " "+apple.getColor() +" apple";
    }

    public void testSomething(){

        List<String> ll = Arrays.asList("Hoola", "chao");

        Object[] objArray = ll.toArray();

        String[] arrayS = new String[ll.size()];
         ll.toArray(arrayS);

    }
}
