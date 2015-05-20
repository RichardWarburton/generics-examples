package _4_wildcards;

import _4_wildcards.Message;

import java.util.List;
import java.util.function.Consumer;

public interface MessageProcessorProblem {

    static void logAll(List<Message> messages) {
        for(Message m: messages) {
            System.out.println(m);
        }
    }

    static void logAllWithAction(List<Message> messages, Consumer<Message> action) {
        messages.forEach(action);
    }

}
