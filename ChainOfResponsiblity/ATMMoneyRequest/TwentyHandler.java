package ChainOfResponsiblity.ATMMoneyRequest;

public class TwentyHandler implements ATMChain{
    ATMChain atmChain;

    @Override
    public void handleRequest(RequestedMoney requestedMoney) {

        if(requestedMoney.getMoney() >=10) {
            if (requestedMoney.getMoney() >= 20) {
                System.out.println(requestedMoney.getMoney());
                int note = (int) requestedMoney.getMoney() / 20;
                System.out.println("Note of 20 -" + note);
                requestedMoney.setMoney(requestedMoney.getMoney() % 20);
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
