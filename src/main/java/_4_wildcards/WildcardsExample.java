package _4_wildcards;

import java.util.Arrays;
import java.util.List;

public class WildcardsExample
{

    private static final List<Message> messages = Arrays.asList(
        new EmailMessage("Hello by email"),
        new TextMessage("Hello by text")
    );

    private static final List<EmailMessage> emailMessages
        = Arrays.asList(new EmailMessage("Hello by email"));

    private static final List<TextMessage> textMessages
        = Arrays.asList(new TextMessage("Hello by text"));

    public static void main(String[] args)
    {
        // 0. log a message
        // 1. log arrays
        // 2. assignment
        // 3. Lists aren't covariant
        // 4. Wildcards
        // 5. Consumer parameter
    }

    static void log(Message message)
    {
        System.out.println(message);
    }

    static void logAll(Message[] messages)
    {
        for (Message message : messages)
        {
            System.out.println(message);
        }
    }

    static void logAll(List<Message> messages)
    {
        for (Message message : messages)
        {
            System.out.println(message);
        }
    }

}
