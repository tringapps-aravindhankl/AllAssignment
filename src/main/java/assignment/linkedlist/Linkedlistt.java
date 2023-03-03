package assignment.linkedlist;
import java.util.logging.Logger;
public class Linkedlistt extends List{
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
    public void addElementAtPos(int index,int value){
            Node n1=new Node(value);
        if(index==0){
            n1.next=this.head;
            this.head=n1;
        }else{
            Node temp=this.head;
            for(int i=1;i<index;i++) {
                temp=temp.next;
            }
            n1.next=temp.next;
            temp.next=n1;
        }
    }

    public void deleteElements(int index){
        Node n2=this.head;
        if(index==0){
            this.head=this.head.next;
        }
        else{
            int i=1;
            while(i<index){
                n2 = n2.next;
                i++;
            }
            n2.next=n2.next.next;
        }
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
