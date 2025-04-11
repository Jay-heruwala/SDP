package StatePattern.TrafficLight;

public class YellowLight implements TrafficLightState {
    @Override
    public String getColor() {
        return "Yellow";
    }

    @Override
    public void handle(TrafficLight trafficLight) {
        System.out.println("Yellow Light - Prepare to Stop");
        trafficLight.setState(new RedLight());
    }

}
