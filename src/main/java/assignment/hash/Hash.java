package assignment.hash;

import java.util.Scanner;

//import hashmapds.Hashmap;
//import hashmapds.Hashset;
//import hashmapds.Treeset;

public class Hash {
	public static void hash() {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Enter your choice 1.Hashmap\n 2.Hashset\n 3.Tree");
   	  int choice=scan.nextInt();
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
  		  
  	  }
	}
}

