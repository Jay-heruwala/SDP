package ChainOfResponsiblity.NumberHandler;

public class Main {
    public static void main(String[] args) {
        ZeroHandler zeroHandler = new ZeroHandler();
        PositiveNumber positiveNumber = new PositiveNumber();
        NegativeHandler negativeHandler = new NegativeHandler();

        Number request = new Number(10);
        zeroHandler.setNext(negativeHandler);
        negativeHandler.setNext(positiveNumber);
        positiveNumber.setNext(zeroHandler);

        zeroHandler.process(request);
    }
}
