package _1_motivation;

import java.util.ArrayList;
import java.util.List;

public class WithGenerics
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        for (final String string : list)
        {
            System.out.println(string);
        }
    }
}
