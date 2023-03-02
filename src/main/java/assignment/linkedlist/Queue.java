package assignment.linkedlist;

public class Queue {
	public static void queue()
    {
        Queuelist list=new Queuelist();
        System.out.println("Queue:");
        list.add(10);
        list.add(20);
        list.add(30);
        list.deleteElements();
        list.add(40);
        list.deleteElements();
        list.print();
    }
}
