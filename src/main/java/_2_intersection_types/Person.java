package _2_intersection_types;

import java.io.*;

public class Person
{
    public static void main(String[] args) throws IOException
    {
        //RandomAccessFile randomAccess = new RandomAccessFile("src/main/resources/person", "rw");
        DataInputStream stream = new DataInputStream(new FileInputStream("src/main/resources/person"));

        Person person = read(stream);
        System.out.println(person);

        /*person = read(randomAccess);
        System.out.println(person);*/
    }

    private static Person read(DataInputStream source)
    {
        try(DataInputStream input = source)
        {
            return new Person(input.readUTF(), input.readInt());
        }
        catch (IOException e)
        {
            e.printStackTrace();
            return null;
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
