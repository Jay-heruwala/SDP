package ObserverPattern.NewsGroup;

public class Subscribe implements Observer {

    String name;
    Subscribe(String name){
        this.name = name;
    }

    @Override
    public void update(String MSG) {
        System.out.println(this.name  + " :" + MSG);
    }
}
