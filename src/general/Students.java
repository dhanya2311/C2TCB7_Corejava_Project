package general;
public class Students {
	String name;
	int USN;
	String Branch;
	String clg;
	
	public Students() {
		
	}
	public Students(String name, int USN, String Branch, String clg)
	{
		this.name = name;
		this.USN=USN;
		this.Branch=Branch;
		this.clg=clg;
		
	}
	public Students(String name) {
		this.name=name;
	}
	public String toString() {
		String str="("+name+","+USN+","+Branch+","+clg+")";
				return str;
	}
	public static void main(String[] args) {
		Students s1=new Students();
		s1.name= "dhanya";
		s1.USN=1234;
		s1.Branch="cse";
		s1.clg="sksjti";
		System.out.println(s1.toString());
		
		Students s2=new Students("deepa",12365, "cse", "sksjti");
		System.out.println(s2.toString());
		
		
	}
}