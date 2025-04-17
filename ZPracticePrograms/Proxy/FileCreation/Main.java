package ZPracticePrograms.Proxy.FileCreation;

public class Main {
    public static void main(String[] args) {
        FileSystem proxyFileSystem = new ProxyFileSystem("admin");
        System.out.println(proxyFileSystem.createFolder("ABC"));
        System.out.println(proxyFileSystem.renameFolder("ABC","XYZ"));
        System.out.println(proxyFileSystem.renameFolder("XYZ","ABC"));
        System.out.println(proxyFileSystem.deleteFolder("ABC"));


    }
}
