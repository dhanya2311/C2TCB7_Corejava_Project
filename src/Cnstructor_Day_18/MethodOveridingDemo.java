package Cnstructor_Day_18;
abstract class Bank
{
	abstract float getRateOfInterest();
	
	void display()
	{
		System.out.println("Abstarct class");
	}
	
}
class SBI extends Bank
{
	@Override
	float getRateOfInterest() {
		return 7.0f;
	}
	
}
class HDFC extends Bank
{
	float getRateOfInterest()
	{
		return 6.8f;
	}
}

class ICICI extends Bank
{
	float getRateOfInterest()
	{
		return 6.9f;
	}
}
public class MethodOveridingDemo {

	public static void main(String[] args) {
		SBI obj=new SBI();
		System.out.println(obj.getRateOfInterest());
		
		Bank obj1=new ICICI();
		System.out.println(obj1.getRateOfInterest());
		
		
	}

}