package curiously_recurring.non_recurring;

public class Main
{
    public static void main(String[] args)
    {
        ConfusedPerson1 confusedPerson1 = new ConfusedPerson1("John");
        System.out.println(confusedPerson1.clone());

        ConfusedPerson2 confusedPerson2 = new ConfusedPerson2("Bob");
        System.out.println(confusedPerson2.clone().clone().getName());
    }

    private void doubleClone(Cloneable<?> confusedPerson2)
    {
        confusedPerson2.clone();
    }

}
