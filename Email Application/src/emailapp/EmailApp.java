package emailapp;
import java.util.*;
import javax.xml.ws.handler.MessageContext.Scope;

public class EmailApp 
{

	public static void main(String[] args) 
	{
		Email e = new Email("john","smith");
		Scanner sc = new Scanner(System.in);
		
		System.out.println(e.showInfo());
		
		System.out.println("\nEnter the key : \n1. To Add Alternate Email\n2. To Set Mailbox capacity \n3. To change password \n4. To Exit");
		int x=sc.nextInt( );
		int y;
		String str;
		switch(x)
		{
			case 1:
				System.out.println("Enter Alternate Email");
				str= sc.nextLine();
				e.setAlternateEmail(str);
				System.out.println(e.getAlternateEmail());
				break;
			case 2:
				System.out.println("Enter Mailbox capacity");
				y =sc.nextInt();
				e.setMailboxCapacity(y);
				System.out.println(e.getMailboxCapacity());
				break;
			case 3:
				System.out.println("Enter New Password");
				str= sc.nextLine();
				e.changePassword(str);
				System.out.println(e.getPassword());
				break;
			case 4:
				System.exit(0);
				
			default: System.out.println("\nOops! Invalid Entry, Try Again!");
				
		}
	
	
	}

}
