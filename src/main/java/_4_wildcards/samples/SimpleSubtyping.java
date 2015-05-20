package _4_wildcards.samples;


import _4_wildcards.EmailMessage;
import _4_wildcards.Message;
import _4_wildcards.TextMessage;

public class SimpleSubtyping {

    public static void main(String[] args) {
        Message m1 = new TextMessage("Hello");
        Message m2 = new EmailMessage("Bonjour");

//        TextMessage m3 = new EmailMessage("Compile error");

    }

}
