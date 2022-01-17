package Exception_Day_15;

public class Testtrycatch2
{
 public static void main(String[] args)
 {
	 try
	 {
	 int dat=50/0;
 }
 catch(ArithmeticException e)
 {
	 System.out.println(e);
 }
 System.out.println("rest o code...");
}
}