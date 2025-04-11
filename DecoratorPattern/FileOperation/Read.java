package DecoratorPattern.FileOperation;

import java.io.IOException;
import java.io.InputStream;

public class Read extends InputStream {

    int lineCounter;
    int spaceCounter;
    int characterCounter;

    InputStream inputStream;
    Read(InputStream inputStream){
        this.inputStream = inputStream;
    }

    @Override
    public int read() throws IOException {
        int character = inputStream.read();

        if(character != -1){
            if(character == '\n'){
                lineCounter++;
            }

            if(Character.isWhitespace(character)){
                spaceCounter++;
            }

            if(!Character.isWhitespace(character)){
                characterCounter++;
            }
        }
        return character;

    }

    public void display(){
        System.out.println(characterCounter + " character is read");
        System.out.println(lineCounter + " line is read");
        System.out.println(spaceCounter + " whitespace is read");
    }
}
