package _1_motivation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PreGenerics
{
    public static void main(String[] args)
    {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add(1);

        Iterator it = list.iterator();
        while (it.hasNext())
        {
            final String value = (String) it.next();
            System.out.println(value);
        }
    }
}
