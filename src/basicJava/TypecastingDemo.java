package basicJava;

public class TypecastingDemo {

	public static void main(String[] args) {

		//Implicit type
		//byte--char--shot--int--long--float--double
		
		int x=65;
		long l1=x;
		System.out.println("int to long conversion:"+l1);
		
		char c1='C';
		int y=c1;
		System.out.println("char to int conversion:"+c1);
		
		int z=7659;
		float f1=z;
		System.out.println("int to float conversion:"+f1);
		
		long l2=44444444445566l;
		float f2=l2;
		System.out.println("long to float conversion:"+f2);
		
		//Explicit
		//double--float--long--int--short--char--byte
		
		double d1=678899906.456;
		float f3=(float) d1;
		System.out.println("double to float:"+f3);
		
		int a=(int)d1;
		System.out.println("double to int:"+a);
		
		int b=97;
		char c4=(char)b;
		System.out.println("int to char:"+c4);
		
		byte b1=(byte)d1;
		System.out.println("double to byte:"+b1);
		
		
		
		
		
		
	}

}
