package _3_curiously_recurring.non_recurring_writable;

public class WritableMain {

    public static void main(String[] args) {

        Buffer b1 = new Buffer();

        Writable b2 = b1.writeInt(42)
                           .writeString("hi");

        // 1) assigning to Buffer b2 won't work because WriteString returns Writable
        // 2) calling readAll won't work
    }

}
