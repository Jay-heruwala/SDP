package FacadePattern.WatchMovie;

public class SoundSystem {
    public void turnOn(){
        System.out.println("Turn on Sound System");
    }

    public void setVolume(int volume){
        System.out.println("Set volume at : " + volume);
    }

    public void turnOff(){
        System.out.println("Turn off Sound System");
    }
}
