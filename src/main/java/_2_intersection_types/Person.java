package _2_intersection_types;

import java.io.Closeable;
import java.io.DataInput;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Person
{
    public static void main(String[] args) throws IOException
    {
        RandomAccessFile randomAccessFile = new RandomAccessFile("src/main/resources/person", "rw");

        /*randomAccessFile.writeUTF("Don Draper");
        randomAccessFile.writeInt(89);
        randomAccessFile.seek(0);*/

        Person person = read(randomAccessFile);
        System.out.println(person);

        randomAccessFile.close();
    }

    private static <I extends DataInput & Closeable> Person read(I input)
    {
        try
        {
            return new Person(input.readUTF(), input.readInt());
        }
        catch (IOException e)
        {
            e.printStackTrace();
            close(input);
            return null;
        }
    }

    private static void close(Closeable input)
    {
        try
        {
            input.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    private final String name;
    private final int age;

    public int getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
    }
}
