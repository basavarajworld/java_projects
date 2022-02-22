package ATM;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Account {
	Scanner sc=new Scanner(System.in);
	DecimalFormat money=new DecimalFormat("'$'###,##0.00");
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance=0;
	private double savingBalance=0;
	
	
	public int setCustomerNumber(int customerNumber)
	{
		this.customerNumber=customerNumber;
		return customerNumber;
	}
	
	public int getCustomerNumber()
	{
		return customerNumber;
	}
	
	public int setPinNumber(int pinNumber)
	{
		this.pinNumber=pinNumber;
		return pinNumber;
	}
	
	public int getPinNumber()
	{
		return pinNumber;
	}
	
	public double getCheckingBalance() 
	{
		return checkingBalance;
	}
	
	public double getSavingBalance() 
	{
		return savingBalance;
	}
	
	public double calcCheckingWithdraw(double amount)
	{
		checkingBalance=(checkingBalance-amount);
		return checkingBalance;
	}
	
	public double calcSavingWithdraw(double amount)
	{
		savingBalance=(savingBalance-amount);
		return savingBalance;
	}
	
	public double calcCheckingDeposit(double amount)
	{
		checkingBalance=(checkingBalance+amount);
		return checkingBalance;
	}
	
	public double calcSavingDeposit(double amount)
	{
		savingBalance=(savingBalance+amount);
		return savingBalance;
	}
	
	public void getCheckingWithdrawlInput()
	{
		System.out.println("Checking Account Balance: " + money.format(checkingBalance));
		System.out.println("Amount you want to withdraw from Checking Account: ");
		double amount=sc.nextDouble();
		
		if((checkingBalance-amount)>=0)
		{
			calcCheckingWithdraw(amount);
			System.out.println("New Checking Account balance: " + money.format(checkingBalance) + "\n");
			
		}
			
		else
		{
			System.out.println("Balance can't be negative." + "\n");
		}
	}
	

	public void getSavingWithdrawlInput()
	{
		System.out.println("Checking Account Balance: " + money.format(savingBalance));
		System.out.println("Amount you want to withdraw from Saving Account: ");
		double amount=sc.nextDouble();
		
		if((savingBalance-amount)>=0)
		{
			calcSavingWithdraw(amount);
			System.out.println("New Saving Account balance: " + money.format(savingBalance)  + "\n");
			
		}
			
		else
		{
			System.out.println("Balance can't be negative." + "\n");
		}
	}
	
	
	public void getCheckingDepositInput()
	{
		System.out.println("Checking Account Balance: " + money.format(checkingBalance));
		System.out.println("Amount you want to deposit in Checking Account: ");
		double amount=sc.nextDouble();
		
		if((checkingBalance+amount)>=0)
		{
			calcCheckingDeposit(amount);
			System.out.println("New Checking Account balance: " + money.format(checkingBalance) + "\n");
			
		}
			
		else
		{
			System.out.println("Balance can't be negative." + "\n");
		}
	}
	
	public void getSavingDepositInput()
	{
		System.out.println("Checking Account Balance: " + money.format(savingBalance));
		System.out.println("Amount you want to deposit in Saving Account: ");
		double amount=sc.nextDouble();
		
		if((savingBalance+amount)>=0)
		{
			calcSavingDeposit(amount);
			System.out.println("New Saving Account balance: " + money.format(savingBalance)  + "\n");
			
		}
			
		else
		{
			System.out.println("Balance can't be negative." + "\n");
		}
	}
	
	

}
