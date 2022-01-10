package Oops_Day_10;

class Box 
{
	float length;
	float breadth;
	float height;
	
	float calcvol()
	{
		return length*breadth*height;
		
	}

}
public class ClassBox{
	public static void main(String[] args) {
	Box box1;
	box1=new Box();
	box1.length=2.5f;
	box1.breadth=1.5f;
	box1.height=3.2f;
	float vol=box1.calcvol();
	System.out.println("volume of Box1 is" +vol);
	}
}