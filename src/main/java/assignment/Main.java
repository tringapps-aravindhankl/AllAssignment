package assignment;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.logging.Logger;

import assignment.bank.Bank;
import assignment.calculator.Calculator;
import assignment.contact.Contact;
import assignment.creditcard.Card;
import assignment.database.Appbase;
import assignment.files.Files;
import assignment.hash.Hash;
import assignment.linkedlist.Linked;
import assignment.maths.Mathscoordinate;
import assignment.shape.Shape;
import assignment.studentgpa.Students;
import assignment.tictactae.Game;
import assignment.updategpa.Helo;
public class Main 
{
    public static void main(String args[]) throws FileNotFoundException {
        	Logger log=Logger.getLogger("hi");
        	int choice = 0;
        	
    		do {
    		  try {
        	  log.info("Enter your choice: \n 1.BankAccount\n 2.Shape\n 3.UpdateGpa\n 4.DataBase\n 5.mathsCoordinate\n 6.CreditCard\n 7.StudentGpa\n 8.LinkedList\n 9.Hash\n 10.Calculator\n 11.Contacts\n 12.Files\n 13.Tic-Tac-Toe\n 14.Exit");
        	  Scanner scan=new Scanner(System.in);
        	  choice=scan.nextInt();
    		  
        	  switch(choice)
        	  {
        	  case 1:
        		  Bank.bank();
        		  break;
        		  
        	  case 2:
        		  Shape.shape();
        		  break;
        		  
        	  case 3:
        		  Helo.mark();
        		  break;
       		  
        	  case 4:
        		  Appbase.database();
        		  break;
        	  case 5:
        		  Mathscoordinate.maths();
        		  break;
        		  
        	  case 6:
        		  Card.card();
        		  break;
       		  
       	     case 7:
       	    	 Students.student();
       		     break;
       		     
        	
         	 case 8:
         		  Linked.linked();
        		  break;
        		 
        		  
        	  case 9:
        		  Hash.hash();
      		      break;
        		 
        		  
        	  case 10: 
        		  Calculator.calculator();
        		  break;
        		  
        	  	  
        	  case 11:
        		  Contact.contact();
        	  	  break;
        		 
       	  case 12:
        		  Files.perform();
        		  break;
        		 
        	  case 13:
        		  Game.game();
        		  break;
        	  default:
        		  log.info("ThankYou");
        		  break;
              }
    		  }
    		  catch(Exception e)
    		  {
    			  String error=" "+e;
    			  log.info(error);
    		  }
        	  }while(choice<14);
        	  
        }
        }