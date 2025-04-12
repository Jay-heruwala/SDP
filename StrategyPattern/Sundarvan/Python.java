package StrategyPattern.Sundarvan;

// Python class (Non-Poisonous Snake)
public class Python implements Snake {
    private BiteBehavior biteBehavior;

    public Python() {
        this.biteBehavior = new NonPoisonousBite();
    }

    @Override
    public String display() {
        return "I am a Python!";
    }

    @Override
    public String performBite() {
       return biteBehavior.bite();
    }

    @Override
    public void setBiteBehavior(BiteBehavior biteBehavior) {
        this.biteBehavior = biteBehavior;
    }
}

