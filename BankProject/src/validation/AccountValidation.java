package validation;

public class AccountValidation {

	public boolean checkAccNo(int accNo)
	{
		if(accNo<=0)
		{
			System.out.println("Invalid Account number.");
			return false;
		}else {
			return true;
		}
	}
	public boolean checkBalance(double bal)
	{
		if(bal<0)
		{
			System.out.println(" Invalid Balance");
			return false;
		}else if(bal>100000) {
			System.out.println("Need Income Proof");
			return false;
		}
		else {
			return true;
		}
	}
	public boolean checkaccHolderName(String accHolderName)
	{
		boolean valid=false;
		char ch;
		
		for(int i=0;i<accHolderName.length();i++)
		{
			ch=accHolderName.charAt(i);
			
			if((ch>=65 && ch<=122) || (ch<=97 && ch>=122))
			{
				valid=true;
			}
			else {
				valid=false;
				break;
			}
		}
		if(valid==true)
		{
			System.out.println("Valid Name");
			return true;
		}
		else {
			System.out.println("Name is Invalid");
			return false;
		}
	}
	public boolean checkAll(int accNo,double bal,String accHolderName)
	{
		if(!checkAccNo(accNo))
		{
			return false;
		}
		else if(!checkaccHolderName(accHolderName))
		{
			return false;
		}else if(!checkBalance(bal)) {
			return false;
		}
		else {
			return true;
		}
	}
}
