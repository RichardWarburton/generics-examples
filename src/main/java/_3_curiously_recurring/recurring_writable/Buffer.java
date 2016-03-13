package _3_curiously_recurring.recurring_writable;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class Buffer implements Writable<Buffer>, Readable {

    private List<Object> data = new ArrayList<>();

    @Override
    public Buffer writeInt(int number) {
        this.data.add(number);
        return this;
    }

    @Override
    public Buffer writeString(String message) {
        this.data.add(message);
        return this;
    }

    public String readAll() {
        return this.data.stream()
                .map(Object::toString)
                .collect(joining(":"));
    }
}
