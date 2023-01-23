import java.util.*;
public class maxsub{
   public static void non(int arr[],int k){
      int i=0;
      int j=0;
      int n=arr.length;
      Deque<Integer>q=new LinkedList<>();
      for(i=0;i<k;i++){
         while(!q.isEmpty() && arr[i]>=arr[q.peek()]){
            q.removeLast();
         }
         q.addLast(i);
      }
      for(;i<n;++i){
         System.out.println(arr[q.peek()]);
         while(!q.isEmpty()&& q.peek()<=i-k){
         q.removeFirst(); 
         }
         while(!q.isEmpty() && arr[i]>=arr[q.peek()]){
            q.removeLast();
         }
         q.addLast(i);
      }
      System.out.println(arr[q.peek()]);   
   }
   public static void main(String arg[]){
      int arr[]={1,2,3,1,4,5,2,3,6};
      non(arr,3);    
   }

} 

