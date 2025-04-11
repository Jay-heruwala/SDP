package FacadePattern.WatchMovie;

public class DVDPlayer {
    public void turnOn(){
        System.out.println("DVD player is on");
    }

    public void play(String movie){
        System.out.println("Playing  movie : " + movie);
    }

    public void stop(){
        System.out.println("Stop Movie");
    }

    public void turnOff(){
        System.out.println("DVD player is OFF");
    }
}

