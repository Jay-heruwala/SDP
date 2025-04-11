package StatePattern.TrafficLight;

public class GreenLight implements TrafficLightState {
    @Override
    public String getColor() {
        return "Green";
    }

    @Override
    public void handle(TrafficLight trafficLight) {
        System.out.println("Grren Light - Go");
        trafficLight.setState(new YellowLight());
    }
}
