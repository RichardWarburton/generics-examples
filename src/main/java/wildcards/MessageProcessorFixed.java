package wildcards;

import java.util.List;
import java.util.function.Consumer;

public interface MessageProcessorFixed {

    static void logAll(List<? extends Message> messages) {
        for(Message m: messages) {
            System.out.println(m);
        }
    }

    static void logAllWithAction(List<? extends Message> messages, Consumer<? super Message> action) {
        messages.forEach(action);
    }
}
