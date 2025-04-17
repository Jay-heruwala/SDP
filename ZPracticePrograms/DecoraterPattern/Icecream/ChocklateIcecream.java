package ZPracticePrograms.DecoraterPattern.Icecream;

public class ChocklateIcecream implements Icecream{
    @Override
    public String getDiscription() {
        return "Chocklate icecream";
    }

    @Override
    public double getCost() {
        return 50.00;
    }
}
