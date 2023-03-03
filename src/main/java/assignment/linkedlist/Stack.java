package assignment.linkedlist;
import java.util.logging.Logger;

public class Stack {
	
	public static void stack()
	{
		Logger log=Logger.getLogger("hi");
		Stacklist list=new Stacklist();
		log.info("Stack");
        list.add(10);
        list.add(20);
        list.add(30);
        list.deleteElements();
        list.print();
    }
}
