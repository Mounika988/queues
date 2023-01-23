import java.util.*;
public  class circularque{
  public static int front;
 public static int rear;
  public static int[]arr;
  public static int size;

  static int n=arr.length;
  circularque(int n){
arr=new int[n];
size=n;
rear=-1;
front=-1;
  }
  public static void  enque(int data){
if(rear+1%n==front)
{
  System.out.println("array is full");
}
if(front==-1 && rear==-1){
  front=rear=0;
}
else{
  rear=(rear+1)%n;
  arr[rear]=data;
}
  }
  public void  deque(){
    if(front==-1 && rear==-1)
    {
      System.out.println("array is empty");
    }
    else if(front==rear){
     front=rear=-1;
    }
    else{
      front=(front+1)%n;
     // System.out.println(front);
      }
    }
      public  int  peek(){
        if(front==-1 && rear==-1)
        {
          System.out.println("array is empty");
        }
        return arr[front]; 
        }
        public  boolean isempty(){
          return rear==-1&& front==-1;
          }
      
  public static void main(String[] args){
circularque q= new circularque (5);
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
