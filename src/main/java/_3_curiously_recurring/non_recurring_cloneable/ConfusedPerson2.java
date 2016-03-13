package _3_curiously_recurring.non_recurring_cloneable;

public class ConfusedPerson2 implements Cloneable<ConfusedPerson2>
{
    private String name;

    public ConfusedPerson2(final String name)
    {
        this.name = name;
    }

    public ConfusedPerson2 clone()
    {
        return new ConfusedPerson2(name);
    }

    public String getName()
    {
        return name;
    }

    public String toString()
    {
        return getName();
    }
}
