package javaAssignments;

public class Assignment3_Exceptionhandling {

	public static void main(String[] args) {

		//ArrayIndexoutOfBoundsException
		int array[]= {2,4,6,8,10,12};
		try {
		System.out.println(array[7]);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Provide a valid index for the given arry");
		}
	
	    System.out.println("**************************");
	    
		//NullPointerException
		String stn=null;
		try{
			System.out.println("String is:" +stn.equals("January"));
		}catch(NullPointerException e)
		{
			System.out.println("The given object is null");
		}
		
		
	
	
	}

}
