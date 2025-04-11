package StatePattern.TrafficLight;

public class RedLight implements TrafficLightState {
    @Override
    public String getColor() {
        return "Red";
    }

    @Override
    public void handle(TrafficLight trafficLight) {
        System.out.println("Red Light - Stop");
        trafficLight.setState(new GreenLight());
    }
}
