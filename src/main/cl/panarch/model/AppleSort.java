package main.cl.panarch.model;


import java.util.Comparator;

public class AppleSort implements Comparator<Apple> {
    @Override
    public int compare(Apple o1, Apple o2) {

        return o1.getWeight() > o2.getWeight()? 1:-1;
        //return o1.getColor().compareTo(o2.getColor());
    }
}
