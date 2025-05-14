package ZPracticePrograms.State.Water;


interface Water{
    public void currentState();
}

class solid implements Water{

    @Override
    public void currentState() {
        System.out.println("Solid State");
    }
}

class Liquid implements Water{

    @Override
    public void currentState() {
        System.out.println("Liquid State");
    }
}

class Gas implements Water{

    @Override
    public void currentState() {
        System.out.println("Gas State");
    }
}


class Content{
    Water water;

    Content(){
        this.water = new solid();
    }

    public void currentState(){
        this.water.currentState();
    }

    public void changeState(Water water) {
        this.water = water;
    }
}


public class Main {
    public static void main(String[] args) {
        Content content = new Content();
        content.currentState();

        content.changeState(new Liquid());
        content.currentState();

        content.changeState(new Gas());
        content.currentState();
    }
}
