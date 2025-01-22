
import java.util.*;
public class Palindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int temp,r,sum=0;
        System.out.println("Enter number to check palindrome");
        int n=sc.nextInt();
        temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }

        if(temp==sum){
            System.out.println("Number" +sum +"is palindrome");
        }
        else{
            System.out.println("Number"+sum+ "is not palindrome");
        }
    }
}
