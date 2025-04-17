package StatePattern.WaterState;

public class GasState implements WaterState{


    @Override
    public void applyCold(Water water) {
        System.out.println("Converting in liquid");
        water.setWaterState(new LiquidState());
    }

    @Override
    public void applyHeat(Water water) {
        System.out.println("Already in GAS");
    }
}
