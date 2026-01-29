import java.util.*;

public class labsheet6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of arry:");
        int num = sc.nextInt();

        int[] arry = new int[num];
        System.out.println("enter the arry of elements:");
        for (int i = 0; i < num; i++) {
            arry[i] = sc.nextInt();
        }

        int unique = 0;
        for (int num1 : arry) {
            unique = unique ^ num1;
        }

        System.out.println("Unique number is: " + unique);

        sc.close();
    }
}


