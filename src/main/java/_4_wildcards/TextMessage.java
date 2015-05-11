package _4_wildcards;

public class TextMessage extends Message{

    public TextMessage(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "TextMessage{" +
                "message='" + message + '\'' +
                '}';
    }
}
