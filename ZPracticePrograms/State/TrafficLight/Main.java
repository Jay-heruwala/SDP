package ZPracticePrograms.State.TrafficLight;

interface State{
    public void handleNextState(Context context);
}

class Context{

    State state;

    Context() {
        this.state = new GreenLight();
    }

    public void changeState(){
        state.handleNextState(this);
    }

    public void setState(State state){
        this.state = state;
    }
}

class YellowLight implements State{

    @Override
    public void handleNextState(Context context) {
        context.setState(new RedLight());
        System.out.println("set Red Light");

    }
}

class GreenLight implements State{

    @Override
    public void handleNextState(Context context) {
        context.setState(new YellowLight());
        System.out.println("set Yellow Light");

    }
}
class RedLight implements State{

    @Override
    public void handleNextState(Context context) {
        context.setState(new GreenLight());
        System.out.println("set Green Light");
    }
}

public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        context.changeState();
        context.changeState();
        context.changeState();
        context.changeState();
        context.changeState();
    }

}
