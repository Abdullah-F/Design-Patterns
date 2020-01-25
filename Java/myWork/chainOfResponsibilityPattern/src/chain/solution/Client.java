package chain.solution;


public class Client {

    public static void main(String[] args) {


        PaymentCheckoutHandler handler = new PaymentCheckoutHandler();// define a handler
        CustomerInfoCheckoutHandler 
                customerInfoCheckoutHandler = new CustomerInfoCheckoutHandler();//another handler

        handler.setNextHandler(customerInfoCheckoutHandler);//set next handler


        handler.handlCheckout();//call the chain of handlers !!




    }

}
