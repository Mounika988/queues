import java.util.*;
public class reverse{
   public static void reversee(Queue<Integer>q){
    Stack<Integer>s1=new Stack<>();
      while(!q.isEmpty()){
         s1.push(q.remove());
      }
      while(!s1.empty()){
         q.add(s1.pop());
      }
   }
   public static void main(String arg[]){
      Queue<Integer>q=new LinkedList<>();
      q.add(1);
      q.add(2);
      q.add(3);
      q.add(4);
      q.add(5);
      q.add(6);
      q.add(7);
      q.add(8);
      q.add(9);
      q.add(10);
      System.out.println(q);
      reversee(q);
      System.out.println(q);
   }

} 
