package ZPracticePrograms.DecoraterPattern.Icecream;

public class VanilaIcecream implements Icecream{
    @Override
    public String getDiscription() {
        return "Vanila icecream";
    }

    @Override
    public double getCost() {
        return 50.00;
    }
}
