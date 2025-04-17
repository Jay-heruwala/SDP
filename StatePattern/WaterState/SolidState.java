package StatePattern.WaterState;

public class SolidState implements WaterState{
    @Override
    public void applyCold(Water water) {
        System.out.println("Already in solid state");
    }

    @Override
    public void applyHeat(Water water) {
        System.out.println("Converting in liquid");
        water.setWaterState(new LiquidState());
    }
}
