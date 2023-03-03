package assignment.linkedlist;
import java.util.logging.Logger;

class Node{
    int name;
    Node nextNode;
    public Node(int value){
        this.name=value;
        this.nextNode=null;
    }
}

public class Queuelist {
	Node rootnode=null;
    Logger log=Logger.getLogger("hi");
    public void add(int value){
        if(this.rootnode==null)
        {
            this.rootnode=new Node(value);
        }
        else{
            Node temp=this.rootnode;
            while(temp.nextNode!=null){
                temp=temp.nextNode;
            }
            temp.nextNode=new Node(value);
        }
    }
    public void deleteelement(){
        Node n2=this.rootnode;
        this.rootnode=n2.nextNode;
    }
    
    public void display(){
        Node temp=this.rootnode;
        if(temp==null){
            System.out.println("invalid");
        }else{
            while(temp!=null){
            	String obj=" "+temp.name;
				log.info(obj);
                temp=temp.nextNode;
            }
        }
    }
}
