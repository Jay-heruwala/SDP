package ZPracticePrograms.Proxy.FileCreation;

public class ProxyFileSystem  implements FileSystem{
    private FileSystem fileSystem;

    String role;
    ProxyFileSystem(String role){
        this.role = role;
        this.fileSystem = new RealFileSystem();;
    }

    @Override
    public boolean createFolder(String name) {

        if(this.role.equalsIgnoreCase("admin")){
            return this.fileSystem.createFolder(name);
        }else{
            throw new RuntimeException("You have no permission");
        }

//        return false;
    }

    @Override
    public boolean deleteFolder(String name) {
        if(this.role.equalsIgnoreCase("admin")){
            return this.fileSystem.deleteFolder(name);
        }else{
            throw new RuntimeException("You have no permission");
        }
//        return false;
    }

    @Override
    public boolean renameFolder(String oldName, String newName) {
        if(this.role.equalsIgnoreCase("admin")){
            return this.fileSystem.renameFolder(oldName,newName);
        }else{
            throw new RuntimeException("You have no permission");
        }
//        return false;
    }
}
