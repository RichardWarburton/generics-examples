package _4_wildcards;


public class SimpleSubtyping {


    public static void main(String[] args) {
        Message m1 = new TextMessage("Hello");
        Message m2 = new EmailMessage("Bonjour");

//        TextMessage m3 = new EmailMessage("Compile error");

    }

}
