package StrategyPattern.Sundarvan;
// Non-Poisonous Bite Behavior
public class NonPoisonousBite implements BiteBehavior {
    @Override
    public String bite() {
        return "This snake has a harmless bite.";
    }
}