import java.util.*;
public class sumofnaturalnumbers{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int sum = 0;
        System.out.println("Sum of natural numbers");
        for(int i = 0; i <= n; i++){
            sum = sum + 1;
        }
        System.out.print(sum);
    }
}