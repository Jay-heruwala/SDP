package AbstractFactoryPattern.Restaurant;

public abstract class AbstractFactory {
    public abstract Appetizer getAppetizer();
    public abstract MainCourse getMainCourse();
    public abstract Dessert getDessert();

    public static AbstractFactory getInstance(String countryCode){
        if(countryCode.equalsIgnoreCase("indian")){
            return new IndianFactory();
        } else if (countryCode.equalsIgnoreCase("chinese")) {
            return new ChineseFactory();
        }else {
            throw new RuntimeException("Invalid Country Code");
        }
    }

    public static String getItem(String countryCode, String item){
        AbstractFactory abstractFactory = null;
        abstractFactory = getInstance(countryCode);

        if(abstractFactory != null){

            if (item.equalsIgnoreCase("maincourse")){
                MainCourse mainCourse = abstractFactory.getMainCourse();
                return mainCourse.getMainCourse();
            } else if (item.equalsIgnoreCase("Appetizer")) {
                Appetizer appetizer = abstractFactory.getAppetizer();
                return appetizer.getAppetizer();
            } else if (item.equalsIgnoreCase("Dessert")) {
                Dessert dessert = abstractFactory.getDessert();
                return dessert.getDessert();
            }else {
                throw new RuntimeException("Invalid Item Code");
            }
        }

        return "";
    }

}
