package ZPracticePrograms.DecoraterPattern.Icecream;

public class CreamDecorator extends IcecreamDecorator{

    CreamDecorator(Icecream icecream){
        super(icecream);
    }

    @Override
    public String getDiscription() {
        return icecream.getDiscription()+" with Cream";
    }

    @Override
    public double getCost() {
        return icecream.getCost() + 15.00;
    }
}
