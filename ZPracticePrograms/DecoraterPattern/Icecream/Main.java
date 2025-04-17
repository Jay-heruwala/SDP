package ZPracticePrograms.DecoraterPattern.Icecream;

public class Main {
    public static void main(String[] args) {
        Icecream icecream1 = new VanilaIcecream();
        Icecream icecream2 = new ChocklateIcecream();

        PeanutDecorator peanutDecorator = new PeanutDecorator(icecream1);

        System.out.println("Description : " +  peanutDecorator.getDiscription());
        System.out.println("Cost : " + peanutDecorator.getCost());

        CreamDecorator creamDecorator = new CreamDecorator(icecream2);
        System.out.println("Description : "+ creamDecorator.getDiscription());
        System.out.println("Cost : " + creamDecorator.getCost());

        Icecream icecream3 = new CreamDecorator(new PeanutDecorator(new ChocklateIcecream()));
        System.out.println("Description : "+ icecream3.getDiscription());
        System.out.println("Cost : " + icecream3.getCost());
    }
}
