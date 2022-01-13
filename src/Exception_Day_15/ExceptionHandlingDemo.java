package Exception_Day_15;

import java.io.IOException;

public class ExceptionHandlingDemo {

	void m()throws IOException
	{
	throw new IOException("device error");//checked exception
	}
	void n()throws IOException
	{
	m();
	}
	void p()
	{
	try
	{
	n();
	}
	catch(Exception e){System.out.println("exception handled");}
	}
	public static void main(String args[])
	{
  ExceptionHandlingDemo obj=new ExceptionHandlingDemo();
	obj.p();
	System.out.println("normal flow...");
	}

}