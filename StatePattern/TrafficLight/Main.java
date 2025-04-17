package StatePattern.TrafficLight;

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
//        System.out.println("Current Light : " + trafficLight.getCurrentLight());
        trafficLight.changeLight();
//        System.out.println("Current Light : " + trafficLight.getCurrentLight());
        trafficLight.changeLight();
//        System.out.println("Current Light : " + trafficLight.getCurrentLight());
        trafficLight.changeLight();

    }
}
