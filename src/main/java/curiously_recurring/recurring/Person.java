package curiously_recurring.recurring;

import java.lang.*;

public class Person implements Cloneable<Person>
{
    private String name;

    public Person(final String name)
    {
        this.name = name;
    }

    public Person clone()
    {
        return new Person(name);
    }

    public String getName()
    {
        return name;
    }
}
