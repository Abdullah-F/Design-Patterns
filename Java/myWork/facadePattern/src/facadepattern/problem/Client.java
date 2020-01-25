package facadepattern.problem;



public class Client {

	public static void main(String [] args){
		
        BillingSystem billingSystem = new BillingSystem();// creating a billing system
        InvoiceCustomerSystem invoiceCustomerSystem = new InvoiceCustomerSystem();//client manages here
                                                                                  //to create the invoice
                                                                                  //system also !


        Bill bill = billingSystem.createBill(1000);//the client code here also creates the bill !
        invoiceCustomerSystem.createInvoiceForBill(bill);// finally an invoice is created for the bill
                                                        //and the client code is title coupled
                                                        // to all sort of details !
		
		
	}
	
}
