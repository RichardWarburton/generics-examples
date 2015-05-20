package _4_wildcards;

import java.util.Arrays;
import java.util.List;

public class WildcardsExample
{
    public static void main(String[] args)
    {
        // set up
        List<Message> messages = Arrays.asList(
            new EmailMessage("Hello by email"),
            new TextMessage("Hello by text")
        );

        List<EmailMessage> emailMessages
            = Arrays.asList(new EmailMessage("Hello by email"));

        List<TextMessage> textMessages
            = Arrays.asList(new TextMessage("Hello by text"));

        // 0. log a message
        // 1. Lists aren't covariant
        // 2. Wildcards
    }

    static void log(Message message)
    {
        System.out.println(message);
    }

    static void logAll(List<? extends Message> messages)
    {
        for (Message message : messages)
        {
            System.out.println(message);
        }
    }

}
