import java.util.*;
public class Sum_dig {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int sum=0,m;
        System.out.println("Enter a number");
        int n=sc.nextInt();
        while(n>0){
            m=n%10;
            sum=sum+m;
            n=n/10;
        }
        System.out.println("Sum of digits is ->"+sum);
    }
}
