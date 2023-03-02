package assignment.linkedlist;


public class Stack {
	public static void stack()
	{
		Stacklist list=new Stacklist();
		System.out.println("Stack");
        list.add(10);
        list.add(20);
        list.add(30);
        list.deleteElements();
        list.print();
    }
}
