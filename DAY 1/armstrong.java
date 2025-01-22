import java.util.*;
public class armstrong{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int c,rem,arm=0;
        System.out.println("Enter a number");
        int n=sc.nextInt();
        c=n;
        while(n>0){
            rem=n%10;
            arm=(rem*rem*rem)+arm;
            n=n/10;
        }
        if(c==n){
            System.out.println("Armstrong number"+n);
        }
        else{
            System.out.println("Not an armstrong number");
        }
    }
}
