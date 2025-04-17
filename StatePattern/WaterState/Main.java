package StatePattern.WaterState;

public class Main {
    public static void main(String[] args) {
        Water water = new Water();
        water.heat();
        water.heat();
        water.heat();
        water.cold();
        water.cold();
        water.cold();
        water.heat();
    }
}
