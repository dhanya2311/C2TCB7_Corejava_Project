package Multi_Ex;


public class BClass {
	int bal1;
	
synchronized void withdraw(int amt)
{
	
	int oldbal=getBalance1();
	bal1=oldbal-amt;
	setBalance1(bal1);
}

int getBalance1()
{
	return Account.Balance1;
}
void setBalance1(int amt)
{
	try
	{
		Thread.sleep(3000);
	}
	catch(Exception e)
	{
		
	}
	Account.Balance1=amt;
}
}