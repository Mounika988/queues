import java.util.*;
public class mincost{
public static int mincosti(int arr[]){
PriorityQueue<Integer> p=new PriorityQueue<>();
for(int i=0;i<arr.length;i++){
   p.add(arr[i]);
}
int res=0;
while(p.size()>1){
int f=p.poll();
int s=p.poll();
res=res+f+s;
p.add(f+s);
}
return res;
}
   public static void main(String arg[]){
      int[] arr={4,3,2,6};
      System.out.println(mincosti(arr));
} 
}
