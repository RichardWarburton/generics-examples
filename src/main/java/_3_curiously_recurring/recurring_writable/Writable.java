package _3_curiously_recurring.recurring_writable;

public interface Writable<T extends Writable> {
    T writeInt(int number);
    T writeString(String message);
}
