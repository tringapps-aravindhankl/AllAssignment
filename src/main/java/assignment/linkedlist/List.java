package assignment.linkedlist;

public class List {
	class Node {
	    int data;
	    Node next;
	    Node(int value){
	        this.data=value;
	        this.next=null;
	    }
	}
	public static void list() {
	                Linkedlistt list=new Linkedlistt();
	                System.out.println("Linkedlist:");
	                list.add(10);
	                list.add(20);
	                list.add(30);
	                list.addElementAtPos(1,15);
	                list.deleteElements(2);
	                list.print();
	            }
	 }
	 
