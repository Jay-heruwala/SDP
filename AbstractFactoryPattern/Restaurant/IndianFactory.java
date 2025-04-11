package AbstractFactoryPattern.Restaurant;

public class IndianFactory extends AbstractFactory{
    @Override
    public Appetizer getAppetizer() {
        return new IndianAppetizer();
    }

    @Override
    public MainCourse getMainCourse() {
        return new IndianMainCourse();
    }

    @Override
    public Dessert getDessert() {
        return new IndianDessert();
    }
}
