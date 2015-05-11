package _4_wildcards;

public class EmailMessage extends Message {

    public EmailMessage(String message){
        super(message);
    }

    @Override
    public String toString() {
        return "EmailMessage{" +
                "message='" + message + '\'' +
                '}';
    }
}
