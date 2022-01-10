package Operators_Day_14;

public class Operator {
	public static void main(String s[])
	{
	int a=10;
	int b=20;
	int c=a+(b++)+(++a)-b;
	System.out.println(c);

	//int c=10+20+11-20; 21

	int d=(a++)+b+a+(++b);
	System.out.println(d);

	//int d=11+21+11+22; 65
	}

}