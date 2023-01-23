import java.util.*;
public  class linkedq {;
  public static int size;
  public static class Node{
    int data;
    Node next;

    public Node(int data){
      this.data=data;
      this.next=null;
      size++;
    } 
  }
  public static Node front;
  public static Node rear;
  public static void  enque(int data){
    Node nn=new Node(data);
    Node temp=front;
    if(front==null){
      front=nn;
      rear=nn;
    }
    else{
    rear.next=nn;
    rear=nn;
    }
  }
  public void  deque(){
    //System.out.println(front);
    if(front==rear){
      front=null;
      rear=null;
    }
    else{
    front=front.next;
      size--;
    }
    }
      public  int  peek(){ 
        return front.data; 
        }
        public  boolean isempty(){
          return front==null;
          }
      
  public static void main(String[] args){
linkedq q= new linkedq ();
enque(1);
enque(2);
enque(3);
enque(4);
enque(5);
System.out.println("display is");
q.deque();
q.deque();
//deque();
enque(6);
enque(7);
while(!q.isempty()){
  System.out.println(q.peek());
  q.deque();
 }
//System.out.println(peek());*/
  }
}

