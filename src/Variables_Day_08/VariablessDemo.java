package Variables_Day_08;

public class VariablessDemo
{
	//class variables
	final static int a =1024;
	int b;
	void func1()
	{
		final int c;
		c=10;
		System.out.println("class variables" +a+ ""+b);
		System.out.println("local variables" +c);
		//a =7890;
		  b =56;
		  System.out.println("class variables" +a+ ""+b);
	}
	void func2() 
	{
		System.out.println("class variables" +a+ ""+b);
	}
	public static void main(String []args)
	{
		VariablessDemo obj = new VariablessDemo();
		System.out.println(obj.b);
		System.out.println(VariablessDemo.a);
	}

}