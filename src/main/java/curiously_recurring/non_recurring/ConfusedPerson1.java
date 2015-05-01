package curiously_recurring.non_recurring;

import java.lang.*;

public class ConfusedPerson1 implements Cloneable<String>
{
    private String name;

    public ConfusedPerson1(final String name)
    {
        this.name = name;
    }

    public String clone()
    {
        return getName();
    }

    public String getName()
    {
        return name;
    }
}
