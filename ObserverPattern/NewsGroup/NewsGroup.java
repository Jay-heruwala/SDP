package ObserverPattern.NewsGroup;

import java.util.ArrayList;
import java.util.List;

public class NewsGroup {
    List<Observer> subscriber = new ArrayList<>();
    String MSG;

    public void attach(Observer o){
        if(subscriber.indexOf(o) == -1){
            subscriber.add(o);
        }else{
            System.out.println("You are already subscribed");
        }

    }

    public  void detech(Observer o){
        if(subscriber.indexOf(o) >= 0){
            subscriber.remove(o);
        }else {
            System.out.println("You are not subscribed");
        }

    }

    public void setMSG(String MSG) {
        this.MSG = MSG;
        notifi();
    }

    public void notifi(){
        for (Observer o : subscriber){
            o.update(this.MSG);
        }

    }
}
