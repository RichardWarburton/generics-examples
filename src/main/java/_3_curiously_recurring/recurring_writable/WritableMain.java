package _3_curiously_recurring.recurring_writable;

import _3_curiously_recurring.non_recurring_writable.*;
import _3_curiously_recurring.non_recurring_writable.Writable;

public class WritableMain {
    public static void main(String[] args) {
        Buffer b1 = new Buffer();

        // Introducing curiously recurring pattern on Writable
        // lets us create fluent-style API

        // 1) assigning to Buffer now works because writeString returns Buffer
        Buffer b2 = b1.writeInt(42)
                      .writeString("OH");

        // 2) calling readAll() now works because return type is Buffer

        String output = b2.writeInt(100)
                          .writeString("HAI")
                          .readAll();

        System.out.println(output);
    }

}
