package assignment.linkedlist;

import java.util.Scanner;

public class Linked {
	public static void linked() {
		Scanner scan=new Scanner(System.in);
		int choice;
		do {
		System.out.println("Enter your choice 1.Linkedlist 2.Queue 3.Stack 4.Exit");
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
		System.out.println("ThankYou");
		}
		
	}while(choice<4);
}
}
