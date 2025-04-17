package ZPracticePrograms.Observer.NewsChannel;

public class Subscriber_ConcreteObserver implements Observer{


    @Override
    public void update(String MSG) {
        System.out.println(MSG);
    }
}
