package ChainOfResponsiblity.ATMMoneyRequest;

public class RequestedMoney {
    double money;

    RequestedMoney(double money){
        FiftyHandler fiftyHandler = new FiftyHandler();
        TwentyHandler twentyHandler = new TwentyHandler();
        TenHandler tenHandler = new TenHandler();
        fiftyHandler.setSuccessor(twentyHandler);
        twentyHandler.setSuccessor(tenHandler);
        this.money = money;
        fiftyHandler.handleRequest(this);
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
