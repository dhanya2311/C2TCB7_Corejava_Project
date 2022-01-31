package Multi_Ex;


public class Account {

	static int Balance=20000;
	static int Balance1=30000;
	public static void main(String[] args) {
		AClass oa=new AClass();
		BClass ob=new BClass();
		
		DepositThread dt1=new DepositThread(oa, 7000,"First");
		DepositThread dt2=new DepositThread(oa, 5000,"Second");
		withdrawThread dt3=new withdrawThread(ob, 1000,"First");
		withdrawThread dt4=new withdrawThread(ob, 6000,"Second");
		
		dt1.start();
		dt2.start();
		dt3.start();
		dt4.start();
		try
        {
        dt1.join();
        dt2.join();
        dt3.join();
        dt4.join();
        }
        catch(Exception e)
        {
        }
System.out.println("Total balance after deposit: "+Balance);
System.out.println("Total balance after withdraw: "+Balance1);
	}

}