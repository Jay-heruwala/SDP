package ZPracticePrograms.DecoraterPattern.Icecream;

public class PeanutDecorator extends IcecreamDecorator{
    PeanutDecorator(Icecream icecream){
        super(icecream);
    }

    @Override
    public String getDiscription() {
        return icecream.getDiscription()+" with peanut";
    }

    @Override
    public double getCost() {
        return icecream.getCost() + 15.00;
    }
}
