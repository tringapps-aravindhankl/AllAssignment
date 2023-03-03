package assignment.linkedlist;
import java.util.logging.Logger;

public class Queue {
	private Queue()
	{
		
	}
	public static void queue()
    {
		Logger log=Logger.getLogger("hi");
        Queuelist list=new Queuelist();
        log.info("Queue:");
        list.add(10);
        list.add(20);
        list.add(30);
        list.deleteElements();
        list.add(40);
        list.deleteElements();
        list.print();
    }
}
