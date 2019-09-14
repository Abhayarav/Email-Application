package emailapp;

import java.util.Scanner;

public class Email 
{
	private String firstname,lastname,password,department,alternateEmail,email,companySuffix="apexcompany.com"; //instance variable
	private int mailboxCapacity=500,defaultPasswordLength=10;
	
	public Email(String firstname,String lastname) //constructor //local variable declaration of contructor
	{
		this.firstname=firstname;   //assignment to instance variable using 'this' keyword because local and instance variables are of same name
		this.lastname=lastname;
		System.out.println("Email created :"+ this.firstname +" "+ this.lastname);
		
		this.department=setDepartment();   
	
		
		System.out.println();
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is : "+this.password);
		
		//generating email
		email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department + "." + companySuffix;
		System.out.println("Your email is : " +email);
		
		
		
	}
	private String setDepartment()
	{  
		System.out.println("Department Codes\n1 for Sales \n2 for Development \n3 for Accounting \n0 for none \nEnter the department");
		Scanner sc= new Scanner(System.in);
		int dep = sc.nextInt();
		if(dep==1)
			return "Sales";
		else if(dep==2)
			return "Development";
		else if(dep==3)
			return "Accounting";
		else
			return "";
		
	}
	
	
	
	//Generate Random password
	private String randomPassword(int length)
	{
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$%&*_";
		char[] password = new char[length];
		for(int i = 0;i<length; i++)
		{
			int rand = (int)(Math.random()*passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
		
	}
	
	//set mailbox capacity
	public void setMailboxCapacity(int capacity)
	{
		this.mailboxCapacity = capacity;
	}
	
	//set alternate email
	public void setAlternateEmail(String altEmail)
	{
		this.alternateEmail = altEmail;
	}
	
	//change password
	public void changePassword(String password)
	{
		this.password = password;
	}
		
	
	public int getMailboxCapacity() {return mailboxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() {return password;}
	
	
	public String showInfo() 
	{
		return "DISPLAY NAME  : " +firstname + " " + lastname +
				"\nCOMPANY EMAIL : " + 	email +
				"\nMAILBOX CAPACITY : " +mailboxCapacity + " mb";
		
	}
	
	

}
