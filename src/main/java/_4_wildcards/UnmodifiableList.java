package _4_wildcards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableList
{
    public static void main(String[] args)
    {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Apple());
    }

    static class Fruit
    {

    }

    static class Apple extends Fruit
    {

    }

    public static <T> List<? extends T> reallyUnmodifiableList(List<? extends T> list)
    {
        return Collections.unmodifiableList(list);
    }
}
