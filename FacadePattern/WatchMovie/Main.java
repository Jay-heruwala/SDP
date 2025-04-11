package FacadePattern.WatchMovie;

public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.startMovie("3 idiots");
        System.out.println("---------------------------------");
        homeTheaterFacade.stopMovie();
    }
}
