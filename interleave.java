import java.util.*;
public class interleave{
   public static void interleavee(Queue<Integer>q){
      Queue<Integer>q1=new LinkedList<>();
      int s=q.size();
      int i;
      for(i=0;i<s/2;i++){
         q1.add(q.remove());
      }
      while(!q1.isEmpty()){
         q.add(q1.remove());
         q.add(q.remove());
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
      interleavee(q);
      System.out.println(q);
   }

} 
