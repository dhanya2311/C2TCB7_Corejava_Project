package Multi_Ex;

public class withdrawThread extends Thread {
	BClass obj1;
	int amt1;
	String msg1;
	
	public withdrawThread(BClass obj1, int amt1,String msg1) {	
		this.obj1 = obj1;
		this.amt1 = amt1;
		this.msg1=msg1;
	}

	@Override
	public void run() {
		try
		{
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			
		}
		//System.out.println("First");
		obj1.withdraw(amt1);
	}
	

}