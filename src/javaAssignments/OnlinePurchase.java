package javaAssignments;

public class OnlinePurchase implements Payment
{
	public void purchaseDetails()
	{
		System.out.println("Purchase details of Online Purchase");
	}

	@Override
	public void cash() {
		System.out.println("Payment made through cash()");
		
	}

	@Override
	public void cheque() {
		System.out.println("Payment made through cheque()");
		
	}

	@Override
	public void upi() {
		System.out.println("Payment made through upi()");
		
	}

	@Override
	public void neft() {
            System.out.println("Payment made through neft()");		
	}	
}

	

