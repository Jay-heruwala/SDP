package FacadePattern.WatchMovie;

public class Projector {
    public void turnOn(){
        System.out.println("Turn on Projector");
    }

    public void setInput(String input){
        System.out.println("Projector Connect with : " + input);
    }

    public void turnOff(){
        System.out.println("Turn off Projector");
    }
}
