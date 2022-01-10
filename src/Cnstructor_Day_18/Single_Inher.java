package Cnstructor_Day_18;


class Bicycle
{
	int gear;
	int speed;
	
	public Bicycle(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	
	void applyBreak(int decrement)
	{
		speed-=decrement;
	}
	
	void speedUp(int increment )
	{
		speed+=increment;
	}

	@Override
	public String toString() {
		return "Bicycle [gear=" + gear + ", speed=" + speed + "]";
	}
	
}

class MountainBike extends Bicycle
{
    int seatHeight;
    
	public MountainBike(int gear, int speed,int seatHeight) {
		super(gear, speed);
		this.seatHeight=seatHeight;
	}
		
	   void	adjustHeight(int value)
		{
		   seatHeight=value;
		}

	@Override
	public String toString() {
		return "MountainBike [seatHeight=" + seatHeight + ", gear=" + gear + ", speed=" + speed + "]";
	}

	
}
class Sportscycle extends Bicycle{
	 
	String suspensionadjust;
	

	public Sportscycle(int gear, int speed,String suspensionadjust) {
		super(gear, speed);
		this.suspensionadjust=suspensionadjust;
	}
	void adjust(String value)
	{
		suspensionadjust=value;
		
		
	}
	@Override
	public String toString() {
		return "Sportscycle [suspensionadjust=" + suspensionadjust + ", gear=" + gear + ", speed=" + speed + "]";
	}
	
	
}

public class Single_Inher {

	public static void main(String[] args) {
		
   MountainBike bike= new MountainBike(5,160,10);
   bike.speedUp(10);
   bike.applyBreak(5);
   //bike.adjustHeight(4);
   System.out.println(bike.toString());
   
   Sportscycle s=new Sportscycle(2,120,"20%");
   System.out.println(s.toString());
	}

}