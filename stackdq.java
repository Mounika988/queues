import java.util.*;
public class stackdq{
   Deque<Integer>q=new LinkedList<>();
   public void push(int data){
      q.addLast(data);
   }
   public void pop(){
q.removeLast();
   }
   public int peek(){
      return q.getLast();
   }
   public boolean isempty(){
      return q.isEmpty();
   }

   public static void main(String arg[]){
      stackdq s =new stackdq();
      s.push(1);
      s.push(2);
      s.push(3);
      s.push(4);
      s.push(5);
      System.out.println(s.peek());
      s.pop();
s.pop();
      while(!s.isempty()){
         System.out.println(s.peek());
         s.pop();
      }

 }

} 