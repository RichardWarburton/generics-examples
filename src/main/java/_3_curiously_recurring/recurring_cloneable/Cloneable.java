package _3_curiously_recurring.recurring_cloneable;

public interface Cloneable<T extends Cloneable<T>>
{
    T clone();
}
