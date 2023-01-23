import java.util.*;
public class reverseq{
   public static Queue<Integer>q1=new LinkedList<>();
   public static void reversee(Queue<Integer>q,int k){
    Stack<Integer>s1=new Stack<>();
    int n=q.size()-k;
      while(q.size()!=n){
         s1.push(q.remove());
      }
      while(!s1.empty()){
         q1.add(s1.pop());
      }
      while(!q.isEmpty()){
         q1.add(q.remove());
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
      reversee(q,5);
      System.out.println(q1);
   }

} 
