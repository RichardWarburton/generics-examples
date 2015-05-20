package _4_wildcards.samples;

import _4_wildcards.EmailMessage;
import _4_wildcards.Message;
import _4_wildcards.TextMessage;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class GenericsSample
{

    public static void main(String[] args) {

        // set up
        List<Message> messageList = Arrays.asList();

        List<EmailMessage> emailMessageList
                = Arrays.asList(new EmailMessage("Hello"));

        List<TextMessage> textMessageList
                = Arrays.asList(new TextMessage("Hello"));


        // not accepted because List<EmailMessage> not <: List<Message>
//        MessageProcessorProblem.logAll(emailMessageList);

        // introducing ? extends
        // accepted because List<EmailMessage> <: List<? extends Message>
        MessageProcessorFixed.logAll(emailMessageList);

        Consumer<Message> processMessage = GenericsSample::processMessage;
        Consumer<Object> print = GenericsSample::print;

        MessageProcessorProblem.logAllWithAction(messageList, processMessage);

        // not accepted because Consumer<Object> not <: Consumer<Message>
//        MessageProcessorProblem.logAllWithAction(messageList, print);

        // introducing ? super
        // accepted because Consumer<Message> <: Consumer<? super Message>
        MessageProcessorFixed.logAllWithAction(emailMessageList, processMessage);

        // mention that can just do System.out::println
        // accepted because Consumer<Object> <: Consumer<? super Message>
        MessageProcessorFixed.logAllWithAction(emailMessageList, print);

    }

    public static void processMessage(Message email) {

    }

    public static void print(Object o){
        System.out.println(o);
    }

}
