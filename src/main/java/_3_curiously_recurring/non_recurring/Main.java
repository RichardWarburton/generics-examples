package _3_curiously_recurring.non_recurring;

public class Main
{
    public static void main(String[] args)
    {
        ConfusedPerson1 confusedPerson1 = new ConfusedPerson1("John");
        //confusedPerson1 = confusedPerson1.clone();
        System.out.println(confusedPerson1);

        ConfusedPerson2 confusedPerson2 = new ConfusedPerson2("Bob");
        doubleClone(confusedPerson2);
    }

    private static void doubleClone(ConfusedPerson2 confusedPerson2) {
        System.out.println(confusedPerson2.clone().clone());
    }

}
