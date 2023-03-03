package assignment.hash;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Treeset {
	public static void tree() {
		TreeSet<Integer> ts=new TreeSet<>();
		Logger l=Logger.getLogger(" ");
		ts.add(21);
		ts.add(11);
		ts.add(72);
		ts.add(43);
		ts.add(52);
		ts.add(22);
		
	    
		Iterator<Integer> it=ts.iterator();
		while(it.hasNext()) {
			l.log(Level.INFO,() ->" " +(it.next()));
		}
		
		l.info("Size :");
		l.log(Level.INFO,()->" "+(ts.size()));
		
		ts.remove(22);
		
		l.log(Level.INFO,()->" "+(ts));
		
		
		
	}
}
