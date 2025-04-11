package DecoratorPattern.FileOperation;

import javax.swing.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException , IOException {

        String msg = "1 \n 2";
        OutputStream outputStream = new FileOutputStream("text.txt");
        Write write = new Write(outputStream);
        write.write(msg.getBytes());
        System.out.println(write.countedByte());
        outputStream.close();

        InputStream inputStream = new FileInputStream("text.txt");
        Read read = new Read(inputStream);
        while (read.read() != -1);
        read.display();
        inputStream.close();


    }
}
