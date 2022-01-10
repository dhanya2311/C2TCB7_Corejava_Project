package Cnstructor_Day_18;

public class Constructor {
	int id;
	String name;
	String email;
	float salary;
	public Constructor() {
		
	}
	public Constructor(int id, String name, String email, float salary) {
		this.id=id;
		this.name= name;
		this.email= email;
		this.salary= salary;
	}
public Constructor(int id) {
	this.id=id;
	
}
public String tostring() {
	String str = "("+id+"," + name+ "," + email+ "," + salary +")";
	return str;
	
}
public static void main(String[] args) {
	Constructor c1= new Constructor();
	c1.id=100;
	c1.name="shree";
	c1.email="shreeharsha";
	c1.salary=30.6f;
	System.out.println(c1.tostring());
	
	Constructor c2 = new Constructor(101, "harsha", "mymail", 50.5f);
	System.out.println(c2.tostring());
	
	Constructor c3= new Constructor(102);
			
}
}