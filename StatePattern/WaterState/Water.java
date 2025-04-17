package StatePattern.WaterState;

public class Water {
    WaterState waterState;

    Water(){
        this.waterState = new LiquidState();
    }

    public void setWaterState(WaterState waterState){
        this.waterState = waterState;

    }

    public void heat(){
        waterState.applyHeat(this);
    }

    public void cold(){
        waterState.applyCold(this);
    }
}
