package chain.solution;


public class PaymentCheckoutHandler extends CheckoutHandler{

    @Override
    public void handlCheckout() {
        System.out.println("Hanling payment of the customer");
        /**
         * does its job and then calls the next handler if any to do its 
         * job as well
         */

        if(nextHandler != null){
            nextHandler.handlCheckout();
        }

    }

}
