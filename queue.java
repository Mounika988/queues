import java.util.*;
public  class queue{
  public static int front=-1;
 public static int rear=-1;
  public static int[]arr={1,2,3,4,5};
  public static void  enque(int data){
if(rear==arr.length-1)
{
  System.out.println("array is full");
}
if(front==-1&& rear==-1){
  front=rear=0;
}
else{
  rear=rear+1;
  arr[rear]=data;
}
  }
  public static void  deque(){
    if(front==-1 && rear==-1)
    {
      System.out.println("array is empty");
    }
    else{
      int i=0;
      for(i=0;i<rear;i++)
      {
        arr[i]=arr[i+1];
      }
    }
      }
      public static int  peek(){
        if(front==-1 && rear==-1)
        {
          System.out.println("array is empty");
        }
        return arr[0]; 
        }
        public static void  display(){
         for(int i=front;i<=rear;i++)
         {
          System.out.println(arr[i]);
         }
        }
  public static void main(String[] args){
enque(1);
enque(2);
enque(3);
enque(4);
enque(5);
display();
deque();
//eque();
//deque();
System.out.println("is");
display();
System.out.println(peek());
  }
}