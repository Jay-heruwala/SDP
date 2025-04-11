package FacadePattern.WatchMovie;

public class HomeTheaterFacade {
    DVDPlayer dvdPlayer;
    SoundSystem soundSystem;
    Projector projector;

    HomeTheaterFacade(){
        this.dvdPlayer = new DVDPlayer();
        this.soundSystem = new SoundSystem();
        this.projector = new Projector();
    }

    public void startMovie(String movieName){
        System.out.println("Setting up home theater to watch a movie...");
        dvdPlayer.turnOn();
        projector.turnOn();
        projector.setInput("DVD");
        soundSystem.turnOn();
        soundSystem.setVolume(5);
        dvdPlayer.play(movieName);
        System.out.println("Enjoy your Movie");
    }

    public void stopMovie(){
        System.out.println("Shutting down home theater...");
        dvdPlayer.stop();
        dvdPlayer.turnOff();
        projector.turnOff();
        soundSystem.turnOff();
    }
}
