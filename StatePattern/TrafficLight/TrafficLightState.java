package StatePattern.TrafficLight;

public interface TrafficLightState {
    public String getColor();
    void handle(TrafficLight trafficLight);
}



