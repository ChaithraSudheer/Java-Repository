package javaAssignments;

public class Assignment1_ReverseString {

	public static void main(String[] args) {
	
		//Reverse string with reverse()
		System.out.println("***********Reverse String with reverse()*********");
		StringBuilder sb=new StringBuilder("Happy New Year");
		sb.append(" All ");
		
		System.out.println("The actual string is:"+sb);
		System.out.println("The reverse string with reverse() is:"+sb.reverse());
		
	
		//Reverse string with without reverse()
		System.out.println("*********Reverse String without reverse()************");
		String ss="Year End";
		String res="";
		for(int i=ss.length()-1;i>=0;i--)
		{
			res=res+ss.charAt(i);
		}
		
        System.out.println("Actual String is:"+ss);
		System.out.println("Reverse of "+ss+" is="+res);
        
	}

}
