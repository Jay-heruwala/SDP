package ZPracticePrograms.Proxy.FileCreation;

import java.io.File;
import java.io.IOException;

public class RealFileSystem implements FileSystem{
    @Override
    public boolean createFolder(String name) {

        File file = new File(name);
        try{
            if(!file.exists()){
                return file.mkdir();
            }
        }catch (Exception e){
            return false;
        }

        return false;
    }

    @Override
    public boolean deleteFolder(String name) {
        File file = new File(name);
        if(file.exists() && file.isDirectory()){
            return file.delete();
        }
        return false;
    }

    @Override
    public boolean renameFolder(String oldName, String newName) {
        File file = new File(oldName);
        if(file.exists()){
            return file.renameTo(new File(newName));
        }

        return false;
    }
}
