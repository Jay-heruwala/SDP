package ZPracticePrograms.Observer.NewsChannel;

public class Main {
    public static void main(String[] args) {
        YouTubeChannel_Subject youTubeChannelSubject = new YouTubeChannel_Subject();

        Observer user1 = new Subscriber_ConcreteObserver();
        Observer user2 = new Subscriber_ConcreteObserver();

        youTubeChannelSubject.attach(user1);
        youTubeChannelSubject.attach(user1);
        youTubeChannelSubject.attach(user2);
        youTubeChannelSubject.stateChange("New Video uploaded");

        youTubeChannelSubject.detech(user1);
        youTubeChannelSubject.stateChange("V1");
    }
}
