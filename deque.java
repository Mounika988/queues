import java.util.*;
public class deque{
   public static void main(String arg[]){
      Deque<Integer>q=new LinkedList<>();
      q.addLast(1);
      q.addLast(2);
      q.addLast(3);
      q.addLast(4);
      q.addFirst(6);
      q.addFirst(7);
      q.addFirst(8);
      q.removeLast();
      q.removeFirst();
      System.out.println(q);
      System.out.println(  q.getFirst());
      System.out.println( q.getLast() );
   }

} 