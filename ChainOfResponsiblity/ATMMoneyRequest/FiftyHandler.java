package ChainOfResponsiblity.ATMMoneyRequest;

public class FiftyHandler implements ATMChain{
    ATMChain atmChain;

    @Override
    public void handleRequest(RequestedMoney requestedMoney) {

        if(requestedMoney.getMoney() >=10) {
            if (requestedMoney.getMoney() >= 50) {
                int note = (int) requestedMoney.getMoney() / 50;
                System.out.println("Note of 50 -" + note);
                requestedMoney.setMoney(requestedMoney.getMoney() % 50);
            }
            atmChain.handleRequest(requestedMoney);
        }else{
            System.out.println("Money must be greater then 9");
        }
    }

    @Override
    public void setSuccessor(ATMChain atmChain) {
        this.atmChain = atmChain;
    }
}
