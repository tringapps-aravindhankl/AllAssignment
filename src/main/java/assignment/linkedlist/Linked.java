package assignment.linkedlist;

import java.util.Scanner;
import java.util.logging.Logger;
public class Linked {
	private Linked()
	{
	
	}
	public static void linked() {
		Logger log=Logger.getLogger("hi");
		Scanner scan=new Scanner(System.in);
		int choice;
		do {
		log.info("Enter your choice 1.Linkedlist 2.Queue 3.Stack 4.Exit");
		choice=scan.nextInt();
		switch(choice) {
		
		case 1:
		List.list();
		break;
			
		case 2:
		Queue.queue();
		break;
		
		case 3:
		Stack.stack();
		break;
		
		default:
		log.info("ThankYou");
		}
		
	}while(choice<4);
}
}
