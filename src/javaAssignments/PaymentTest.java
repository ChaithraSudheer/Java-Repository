package javaAssignments;

public class PaymentTest {

	public static void main(String[] args) 
	{
		OnlinePurchase onp=new OnlinePurchase();
		onp.purchaseDetails();//individual
		onp.cash();//inherited abstract
		onp.cheque();//inherited abstract
		onp.upi();//inherited abstract
		onp.neft();//inherited abstract
		
		
		System.out.println("*************************");
		
		Payment pa=new OnlinePurchase();
		pa.cash();
		pa.cheque();
		pa.upi();
		pa.neft();
		
		System.out.println("**************************");
		
		OfflinePurchase ofp=new OfflinePurchase();
		ofp.PurchaseDetails();
		ofp.cash();
		ofp.cheque();
		ofp.upi();
		ofp.neft();
		

	}

}
