package _4_wildcards;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class WildcardsExample
{
    public static void main(String[] args)
    {
        // set up
        List<Message> messageList = Arrays.asList(
            new EmailMessage("Hello by email"),
            new TextMessage("Hello by text")
        );

        List<EmailMessage> emailMessageList
            = Arrays.asList(new EmailMessage("Hello by email"));

        List<TextMessage> textMessageList
            = Arrays.asList(new TextMessage("Hello by text"));

        // 1. Lists aren't covariant
        // 2. Example with consumer
        // 3. Wildcards
    }

    static void logAll(List<Message> messages)
    {
        for (Message m : messages)
        {
            System.out.println(m);
        }
    }

    static void logAllWithAction(List<? extends Message> messages, Consumer<? super Message> action)
    {
        messages.forEach(action);
    }
}
