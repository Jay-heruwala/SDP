package ChainOfResponsiblity.ATMMoneyRequest;

public class TenHandler implements ATMChain{
    ATMChain atmChain;
    @Override
    public void handleRequest(RequestedMoney requestedMoney) {
        if(requestedMoney.getMoney() >=10) {
            System.out.println(requestedMoney.getMoney());
                int note = (int) requestedMoney.getMoney() / 10;
                System.out.println("Note of 10 -" + note);

            }
    }

    @Override
    public void setSuccessor(ATMChain atmChain) {

    }
}
