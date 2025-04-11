package DecoratorPattern.FileOperation;

import java.io.IOException;
import java.io.OutputStream;

public class Write extends OutputStream {
    int countByte;
    OutputStream outputStream;

    Write(OutputStream outputStream){
        this.outputStream = outputStream;
    }

    @Override
    public void write(int b) throws IOException {
        countByte++;
        this.outputStream.write(b);
    }

    public String countedByte(){
        return this.countByte + " is written";
    }
}
