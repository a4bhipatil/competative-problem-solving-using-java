import java.util.*;
public class labsheet4 {
   public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the number of employee and number of team exactly k members");
    int n=sc.nextInt();
    int k=sc.nextInt();
    long result=1;
    for(int i=2;i<=n;i++){
        result*=i;
        }
    long result1=1;
    for(int i=2;i<=k;i++){
        result1*=i;
        }
    long result2=1;
    int s=n-k;
    for(int i=2;i<=s;i++){
        result2*=i;
        }        
    int total=(int) (result/(result1*result2));
        System.out.println(total);
   } 
}
