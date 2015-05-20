package _4_wildcards.samples;

import _4_wildcards.EmailMessage;
import _4_wildcards.Message;
import _4_wildcards.TextMessage;

public class CovariantArrays {

    public static void main(String[] args) {
        // set up
        EmailMessage[] emailMessages = new EmailMessage[10];
        emailMessages[0] = new EmailMessage("Bonjour");

        // accepted because EmailMessage[] <: Message[]
        Message[] messages = emailMessages;

        // ArrayStoreException
        messages[0] = new TextMessage("Hello");

        // set up
        Integer[] numbers = {3, 2, 4};
        String[] words = {"Hello", "World"};

        // accepted because Integer[] <: Object[]
        sort(numbers);
        // accepted because String[] <: Object[]
        sort(words);

        // accepted because Integer[] <: Object[]
        findElement(numbers, 3);

    }

    //
    public static void sort(Object[] items) {

    }

    public static boolean findElement(Object[] items, Object elem) {
        return false;
    }


}
