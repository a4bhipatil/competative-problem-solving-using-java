import java.util.*;
public class labsheet1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int price,discount,Finalprice;
        int total=0,n;
        System.out.println("Number of item in the order");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            price=sc.nextInt();
            discount=sc.nextInt();
            Finalprice=price-(price*discount/100);
            total+=Finalprice;
        }
        if(total>=1000){
            total=total-150;
        
        }
        else if(total>=500){
            total=total-(total*10/100);
        }
        System.out.println("The final cost after all discount will be: "+total);


    }

    
}
