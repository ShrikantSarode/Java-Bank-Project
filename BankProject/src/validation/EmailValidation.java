//package validation;
//
//import java.util.Scanner;
//
//public class EmailValidation {
//	
//	public void checkEmail(String email)
//	{
//		
//		int a=email.indexOf('@');
//		
//		int d=email.indexOf('.');
//		
//		if(a!=-1 && a<d && d!=-1)
//		{
//			System.out.println("valid");
//		}
//		else {
//			System.out.println("Invalid");
//		}
//		System.out.println(a);
//		System.out.println(d);
//	}
//
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Email: ");
//		String email=sc.next();
//	
//		
//	
//		EmailValidation emailValidation=new EmailValidation();
//		emailValidation.checkEmail(email);
//		
//		
//	}
//	 
//}
