package banking;
import java.util.*;
public class Account {
	int balance;boolean account=false;
	Scanner sc=new Scanner(System.in);
	String add="+",diff="-";
	LinkedList<String> history=new LinkedList<>();
	void createAccount ()
	{
		System.out.println("Account has been created deposit a minimum of Rs.1000");
		balance=sc.nextInt();
		this.account=true;
	}
	void deposit(int amounts)
	{
		balance+=amounts;
		add+=String.valueOf(amounts);
		history.add(add);
	}
	void withdrawl(int amounts)
	{
		if(amounts>balance)
		{
			System.out.println("Insufficient Balance");
		}
		else
		{
		balance-=amounts;
		diff+=String.valueOf(amounts);
		history.add(diff);
		}
	}
	void balance()
	{
		System.out.println(balance);
	}
	void his()
	{
		Iterator<String> it=history.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}