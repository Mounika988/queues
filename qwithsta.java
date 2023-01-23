import java.util.*;
public  class qwithsta{
   Stack<Integer>s1=new Stack<>();
   Stack<Integer>s2=new Stack<>();

   public void enque(int data){
if(s1.empty()){
   s1.push(data);
}
else{
   while(!s1.empty()){
      s2.push(s1.pop());
   }
   s1.push(data);
   while(!s2.empty()){
      s1.push(s2.pop());
   }
}
}
public void deque(){
   if(s1.empty()){
     System.out.println("no elements in queue");
   }
   else{
     s1.pop();
   }
   }
   public int peek(){
        return s1.peek();
      }
      public void display(){
         while(!s1.empty()){
            System.out.println(s1.peek());
            s1.pop();
         }
      }

  public static void main(String[] args){ 
   qwithsta q=new qwithsta();
q.enque(1);
q.enque(2);
q.enque(3);
q.enque(4);
q.enque(5);
q.deque();
q.deque();
q.display();
  }
}
