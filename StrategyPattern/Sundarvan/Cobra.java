package StrategyPattern.Sundarvan;

// Cobra class (Poisonous Snake but can change)


public class Cobra implements Snake {
    private BiteBehavior biteBehavior;

    public Cobra() {
        this.biteBehavior = new PoisonousBite();
    }

    @Override
    public String display() {
       return "I am a Cobra!";
    }

    @Override
    public String performBite() {
        return biteBehavior.bite();
    }

    @Override
    public void setBiteBehavior(BiteBehavior biteBehavior) {
        this.biteBehavior = biteBehavior;
        // System.out.println("Cobra bite behavior changed!");
    }
}