package _2_intersection_types.samples;

import java.io.IOException;
import java.io.RandomAccessFile;

public class TestData
{
    public static void addMadMan(RandomAccessFile randomAccessFile) throws IOException
    {
        randomAccessFile.writeUTF("Don Draper");
        randomAccessFile.writeInt(89);
        randomAccessFile.seek(0);
    }
}
