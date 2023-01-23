import java.util.*;
public class queuedq{
   Deque<Integer>q=new LinkedList<>();
   public void push(int data){
      q.addLast(data);
   }
   public void pop(){
q.removeFirst();
   }
   public int peek(){
      return q.getFirst();
   }
   public boolean isempty(){
      return q.isEmpty();
   }

   public static void main(String arg[]){
      queuedq q =new queuedq();
      q.push(1);
      q.push(2);
      q.push(3);
      q.push(4);
      q.push(5);
      System.out.println(q.peek());
      q.pop();
q.pop();
      while(!q.isempty()){
         System.out.println(q.peek());
         q.pop();
      }

 }

} 
