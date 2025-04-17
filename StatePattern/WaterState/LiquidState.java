package StatePattern.WaterState;

public class LiquidState implements WaterState{
    @Override
    public void applyCold(Water water) {
        System.out.println("Converting in Solid");
        water.setWaterState(new SolidState());
    }

    @Override
    public void applyHeat(Water water) {
        System.out.println("Converting in Gas");
        water.setWaterState(new GasState());
    }
}
