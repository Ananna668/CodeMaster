import java.util.*;
public class fibo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=0,b=0,c=1;
        System.out.println("Enter limit upto which you want fibo series");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            a=b;
            b=c;
            c=a+b;
            System.out.print(a+" ");
        }
    
    }
}
