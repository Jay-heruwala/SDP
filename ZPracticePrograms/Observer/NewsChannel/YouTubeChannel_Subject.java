package ZPracticePrograms.Observer.NewsChannel;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel_Subject {
    String msg;

    List<Observer> observerList = new ArrayList<>();

    public void attach(Observer o){
        if(observerList.indexOf(o) == -1) {
            observerList.add(o);
        }else{
            System.out.println("Already subscribed");
        }
    }

    public void detech(Observer o){
        observerList.remove(o);
    }

    public void stateChange(String msg){
        this.msg = msg;
        notifye();
    }

    public void notifye(){
        for(Observer observer : observerList){
            observer.update(this.msg);
        }
    }

}
