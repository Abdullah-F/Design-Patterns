package chain.solution;



/**
 * a class that composes an a reference to the next handler in a generic way
 * @author abdullah-fadhel
 */
public abstract class CheckoutHandler {

    protected CheckoutHandler nextHandler;


    public abstract void handlCheckout();


    public void setNextHandler(CheckoutHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
