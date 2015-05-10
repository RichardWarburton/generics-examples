package wildcards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableList
{

    public static void main(String[] args)
    {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Apple());

        List<Fruit> unmodifiableFruits = Collections.unmodifiableList(fruits);
        unmodifiableFruits.add(new Apple());

        List<? extends Fruit> reallyUnmodifiableList = unmodifiableList(fruits);

        //reallyUnmodifiableList.add(new Apple());
        final Fruit fruit = reallyUnmodifiableList.get(0);

        // Still not typesafe
        reallyUnmodifiableList.remove("");
    }

    public static <T> List<? extends T> unmodifiableList(List<? extends T> list)
    {
        return Collections.unmodifiableList(list);
    }

    static class Fruit
    {

    }

    static class Apple extends Fruit
    {

    }
}
