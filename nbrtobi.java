import java.util.*;
public class nbrtobi{
   public static void binary(int n){
    Queue<String> q=new LinkedList<>();
    int i;
    q.add("1");
    while(n>0){
      String s1=q.peek();
      q.remove();
      System.out.println(s1);
      String s2=s1;
      q.add(s1+'0');
      q.add(s2+'1');
      n--;
    }
   /* StringBuilder s=new StringBuilder("");
    for(i=n;i>0;i--){
      s=new StringBuilder();
      int j=i;
while(j!=0){
   //System.out.println("j is"+j);
   int r=j%2;
   s.append(r);
   j=j/2;
}
q.add(s.reverse().toString());
    }
     /*while(!q.isEmpty()){
      System.out.print(q.peek());
      q.remove();
     }
     System.out.println(q);*/
    }
   public static void main(String arg[]){
     int n;
     Scanner s=new Scanner(System.in);
     System.out.println("Enter a number");
     n=s.nextInt();
     binary(n);

   }

} 
