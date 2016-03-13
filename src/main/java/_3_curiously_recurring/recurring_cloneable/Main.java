package _3_curiously_recurring.recurring_cloneable;

public class Main
{
    public static void main(String[] args)
    {
        Person person = new Person("John");
        System.out.println(person.clone().getName());
    }

    private static void doubleClone(Cloneable<?> cloneable)
    {
        // Clone enough time to be a villain in an Arnie movie.
        cloneable.clone().clone().clone().clone().clone().clone();
    }

}
