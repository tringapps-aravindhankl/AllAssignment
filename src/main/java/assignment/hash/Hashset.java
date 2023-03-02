package assignment.hash;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hashset {
	public static void set() {
		Logger l=Logger.getLogger("hi");
		Scanner scan=new Scanner(System.in);
		HashSet<Integer> set=new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(20);
		set.add(55);
		
		Iterator<Integer> it=set.iterator();
		while(it.hasNext()) {
			l.log(Level.INFO,()->" " +it.next());
		}
		
		l.info("set cannot allowed dublicate element");
		l.info("Enter search Element");
		int search=scan.nextInt();
		if(set.contains(search)) {
			l.info("Element is found");
		}
		else
		{
			l.info("Element is not found");
		}
		}
}
