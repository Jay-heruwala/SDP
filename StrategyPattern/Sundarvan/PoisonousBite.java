package StrategyPattern.Sundarvan;
// Poisonous Bite Behavior
public class PoisonousBite implements BiteBehavior {
    @Override
    public String bite() {
        return "This snake has a venomous bite!";
    }
}

