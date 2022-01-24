package Generic_Day_19;

public class StringDemo {



	public static void main(String[] args) {
	String s1="Java";
	String s2="Java";
	String s3=new String("Programmer");
	String s4=new String("Programmer");
	
	System.out.println("The length of the strings are");
	System.out.println(s1.length()+" " +s2.length()+ " "+s3.length()+" "+s4.length());
	System.out.println(s2);
	//String s5=s1+s3;
	System.out.println(s1+s3);
	String s6=s1.toUpperCase();
	System.out.println(s6);
	System.out.println(s6.toLowerCase());
	
	String s7=s3.substring(3);
	String s8=s3.substring(3, 10);
	System.out.println(s7 + " " +s8);
	
	System.out.println(s3.substring(3, 7));
	
	String sentence="Hi welcome to java class";
	char ch[]=sentence.toCharArray();
	
	for(int i=0;i<sentence.length();i++)
	{
		System.out.print(ch[i]);
	}
	
	//String sentence="Hi welcome to java class";
	
	
	if(s3.startsWith("Z"))
	{
		System.out.println("Strts with p");
		
	}
	
	if(s1.equalsIgnoreCase(s3))
	{
		System.out.println("They are equal");
	}
	if(s1==s3)
	{
System.out.println("They are equal");
	}
	}

}
