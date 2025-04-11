package ChainOfResponsiblity.NumberHandler;

public interface Chain {
    public void process(Number request);
    public void setNext(Chain chain);
}
