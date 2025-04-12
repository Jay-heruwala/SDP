package StrategyPattern.Sundarvan;
public class Main {
    public static void main(String[] args) {
        Snake cobra = new Cobra();

        System.out.println(cobra.display());
        System.out.println(cobra.performBite()); // Initially poisonous

        System.out.println("Changing Cobra's bite behavior...");

        cobra.setBiteBehavior(new NonPoisonousBite()); // Change to non-poisonous
        System.out.println(cobra.performBite());// Now non-poisonous

        
    }
}