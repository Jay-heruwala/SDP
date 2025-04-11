package ChainOfResponsiblity.NumberHandler;

public class PositiveNumber implements Chain{
    Chain nextChain;
    @Override
    public void process(Number request) {
        if(request.getNumber() > 0){
            System.out.println(" Handel by Positive Exception : " + request.getNumber());

        }else{
            System.out.println("Unable to Handel by Positive Exception");
            nextChain.process(request);
        }
    }

    @Override
    public void setNext(Chain chain) {
        this.nextChain = chain;
    }
}
