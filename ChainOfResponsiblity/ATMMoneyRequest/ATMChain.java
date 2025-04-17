package ChainOfResponsiblity.ATMMoneyRequest;

public interface ATMChain {
    public void handleRequest(RequestedMoney requestedMoney);
    public void setSuccessor(ATMChain atmChain);
}
