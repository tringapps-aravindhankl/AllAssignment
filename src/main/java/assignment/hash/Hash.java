package assignment.hash;

import java.util.Scanner;
public class Hash {
	private Hash()
	{
	
	}
	public static void hash() {
	  Scanner scan=new Scanner(System.in);
	  boolean ch=true;
	  int choice;
	  while(ch)
   	  {
	  System.out.println("Enter your choice 1.Hashmap\n 2.Hashset\n 3.Tree\n 4.Exit");
   	  choice=scan.nextInt();
   	  ch = true;
   	  
  	  switch(choice)
  	  {
  	  case 1:
          Hashmap.hashmap();
  		  break;
  	  
  	  case 2:
  		  Hashset.set();
  		  break;
  		  
  	  case 3:
  		  Treeset.tree();
  		  break;
  	  default:
  		  ch=false;
  		  break;
  		  
  	  }
   	  }
	}
}

