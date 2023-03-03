package assignment.linkedlist;
import java.util.logging.Logger;

class Node{
    int data;
    Node next;
    public Node(int value){
        this.data=value;
        this.next=null;
    }
}

class Queuelist {
	Node head=null;
    Logger log=Logger.getLogger("hi");
    public void add(int value){
        if(this.head==null)
        {
            this.head=new Node(value);
        }
        else{
            Node temp=this.head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=new Node(value);
        }
    }
    public void deleteElements(){
        Node n2=this.head;
        this.head=n2.next;
    }
    
    public void print(){
        Node temp=this.head;
        if(temp==null){
            log.info("invalid");
        }else{
            while(temp!=null){
            	String obj=" "+temp.data;
		log.info(obj);
                temp=temp.next;
            }
        }
    }
}

