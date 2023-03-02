package assignment.linkedlist;


class Nodenext{
    int data;
    Nodenext next;
    
    Nodenext(int value){
        this.data=value;
        this.next=null;
    }
}

public class Stacklist
{
    Nodenext head=null;
    int count=0;

    public void add(int value){
        if(this.head==null)
        {
            this.head=new Nodenext(value);
            this.count++;
        }
        else{
            Nodenext temp=this.head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=new Nodenext(value);
            this.count++;
        }
    }
    
    public void deleteElements(){
        Nodenext n2=this.head;
        int i=1;
        while(i<this.count-1){
            n2 = n2.next;
            i++;
        }
        n2.next=n2.next.next;
    }
    public void print(){
        Nodenext temp=this.head;
        if(temp==null){
            System.out.println("invalid");
        }else{
            while(temp!=null){
                System.out.println(temp.data);

                temp=temp.next;
            }
        }
    }
}

