package ZPracticePrograms.Proxy.FileCreation;

public interface FileSystem {

    public boolean createFolder(String name);
    public boolean deleteFolder(String name);
    public boolean renameFolder(String oldName,String newName);
}
