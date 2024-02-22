package javaAssignments;

public class Assignment2_PrimeNumbers {

	public static void main(String[] args) {
		
		int i,j, count, num=100;
		
		System.out.println("Prime numbers from 1 to 100 are: ");
		
		for(i=2; i<=num; i++)
		{
			count = 0;
			for(j=i; j>=1; j--)
			{
				if(i%j==0)
					count=count+1;
			}
			
			if(count==2)
				System.out.println(i);
		}
		
	}

}
