package Keyword_Day_05;
public class TypecastingDemo {

	public static void main(String[] args) {
		// widening
		byte b = 10;
		int i = b;
		
		System.out.println(i);

		float f = 22.14f;
		double d = f;

		System.out.println(d);

		char ch = 'A';
		int i3 = ch;

		System.out.println(i3);

		// narrowing
		float f1 = 10.53f;
		long l = (long) f1;

		System.out.println(l);

		float f2 = 34.56f;
		int i1 = (int) f2;

		System.out.println(i1);

		long l1 = 9224562158694l;
		int i2 = (int) l1;

		System.out.println(i2);

		byte b1=80;
		char ch1=(char)b1;
		System.out.println(ch1);
		
	}

}