package ATM;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;


public class ChoiceMenu extends Account {
	Scanner menuInput=new Scanner(System.in);
	DecimalFormat money=new DecimalFormat("'$'###,##0.00");
	
	HashMap<Integer, Integer> data=new HashMap<Integer, Integer>();
	
	//Validate login information customer number and pin number
	
	public void getLogin() throws IOException
	{
		int x=1;
		do
		{
			try
			{
				/*
				 * Accounts in a HashMap form, key = customer number, value = pin
				 * number
				 */
				
				data.put(123123123, 12345);
				data.put(123412345, 1236);
				
				System.out.println("Welcome to the ATM Project!");
				
				System.out.println("Enter your Customer Number: ");
				setCustomerNumber(menuInput.nextInt());
				
				System.out.println("Enter your pin: ");
				setPinNumber(menuInput.nextInt());
			}
			catch(Exception e)
			{
				System.out.println("\n" + "Inavlid character(s). Only numbers." + "\n");
				x=2;
			}
			//loop for checking customerNumber and pinNumber
			for(Entry<Integer,Integer> entry:data.entrySet())
			{
				if(entry.getKey()==getCustomerNumber() && entry.getValue()==getPinNumber())
				{
					getAccountType();
				}
			}
			System.out.println("\n" + "Wrong Customer Number or Pin Number." + "\n"); 
			
		}while(x==1);
	}
	
	//Account type menu with selection
	
	public void getAccountType()
	{
		System.out.println("Select the Account you want to access: ");
		System.out.println("Type 1- Checking Account");
		System.out.println("Type 2- Saving Account");
		System.out.println("Type 3- Exit");
		System.out.println("Choice: ");
		
		selection=menuInput.nextInt();
		
		switch(selection)
		{
		case 1:
			getChecking();
			break;
		
		case 2:
			getSaving();
			break;
		
		case 3:
			System.out.println("Thank You for using this ATM: ");
			break;
		
			default:
				System.out.println("\n" + "Inavlid Choice. " + "\n");
				getAccountType();	
		}
	}
	
	//Display Checking Account Menu with Selections
	
	public void getChecking()
	{
		System.out.println("Checking Account: ");
		System.out.println("Type 1- View Balance");
		System.out.println("Type 2- Withdraw Money");
		System.out.println("Type 3- Deposit Money");
		System.out.println("Type 4- Exit");
		System.out.println("Choice: ");
		
		selection=menuInput.nextInt();
		
		switch(selection)
		{
		case 1:
			System.out.println("Checking Account Balance: " + money.format(getCheckingBalance()) + "\n");
			getAccountType();
			break;
			
	
		case 2:
			getCheckingWithdrawlInput();
			getAccountType();
			break;
			
		case 3:
			getCheckingDepositInput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Thank You for using this ATM. ");
			break;
			
	    default:
	    	System.out.println("\n" + "Invalid choice." + "\n");
	    	getChecking();
		}
	}
	
	//Display saving account menu with selection
	
	public void getSaving()
	{
		System.out.println("Saving Account: ");
		System.out.println("Type 1- View Balance");
		System.out.println("Type 2- Withdraw Money");
		System.out.println("Type 3- Deposit Money");
		System.out.println("Type 4- Exit");
		System.out.println("Choice: ");
		
		selection=menuInput.nextInt();
		
		switch(selection)
		{
		case 1:
			System.out.println("Saving Account Balance: " + money.format(getSavingBalance()) + "\n");
			getAccountType();
			break;
			
	
		case 2:
			getSavingWithdrawlInput();
			getAccountType();
			break;
			
		case 3:
			getSavingDepositInput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Thank You for using this ATM. ");
			break;
			
	    default:
	    	System.out.println("\n" + "Invalid choice." + "\n");
	    	getSaving();
		}
	}
	int selection;
		
}
	
	
