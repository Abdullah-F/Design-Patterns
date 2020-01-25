package facadepattern.solution;


public class FinancialSystemFacade {
    /**
     * facade pattern introduces an interface class such this which takes 
     * the responsibility for interacting with other subsystems 
     * that the client needs to talk to such (invoice system, billing system)
     * so that the user is decoupled from these details and they are abstracted away
     * and with a single call from the client to this interface every thin gets prepared
     * for completing the process.
     */

    private BillingSystem billingSystem;// creating a billing system

    private InvoiceCustomerSystem invoiceCustomerSystem;//creating an invoice stsyem

    public void createInvoice(Integer amount){//creates invoice 
         // by bthis method here the client asks the facde 
         // to create an invoice, so this process is abstracted away from
         // the client!. GREAT :)

        Bill bill = billingSystem.createBill(amount);
        invoiceCustomerSystem.createInvoiceForBill(bill);

    }


    public void setBillingSystem(BillingSystem billingSystem) {
        //here we set the proper billing system, could be any!.
        this.billingSystem = billingSystem;
    }

    public void setInvoiceCustomerSystem(InvoiceCustomerSystem invoiceCustomerSystem) {
        //here we set the prorper invoice system, could be any!. 
        this.invoiceCustomerSystem = invoiceCustomerSystem;
    }
}
