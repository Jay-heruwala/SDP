package StatePattern.TrafficLight;

public class TrafficLight {
    TrafficLightState state;

    TrafficLight(){
        this.state = new RedLight();
    }

    public void changeLight(){
        state.handle(this);
    }

    public void setState(TrafficLightState state){
        this.state = state;
    }

    public String getCurrentLight(){
        return this.state.getColor();
    }
}
