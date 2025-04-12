package StrategyPattern.Sundarvan;

public interface Snake {
    String display();
    String performBite();
    void setBiteBehavior(BiteBehavior biteBehavior); // Allow changing behavior dynamically
}