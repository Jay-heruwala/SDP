package ObserverPattern.NewsGroup;

public class Main {
    public static void main(String[] args) {
        Observer user1 = new Subscribe("user1");
        Observer user2 = new Subscribe("user2");
        Observer user3 = new Subscribe("user3");


        NewsGroup newsGroup = new NewsGroup();
        newsGroup.attach(user1);
        newsGroup.attach(user2);
        newsGroup.attach(user3);
        newsGroup.setMSG("India won the match");

        newsGroup.detech(user2);
        newsGroup.setMSG("India beat Africa");
    }
}
