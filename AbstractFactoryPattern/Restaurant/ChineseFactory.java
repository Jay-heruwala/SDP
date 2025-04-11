package AbstractFactoryPattern.Restaurant;

public class ChineseFactory extends AbstractFactory{
    @Override
    public Appetizer getAppetizer() {
        return new ChineseAppetizer();
    }

    @Override
    public MainCourse getMainCourse() {
        return new ChineseCourse();
    }

    @Override
    public Dessert getDessert() {
        return new ChineseDessert();
    }
}
