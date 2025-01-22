
import java.util.*;
public class Fact {

  //  public void fibo(int n){
    //     int f=1;
      //  for(int i=1;i<=n;i++){
        //    f=n*i;
        //}
    //}
    

    //public static void main(String args[]){
      //  Scanner sc=new Scanner(System.in);
        //System.out.println("Hello world");
        //System.out.println("Enter a number");
        //int n=sc.nextInt();
        //System.out.println("Factorial of given number is ->");
        //fibo(n);

    //}

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int fact=1;
        System.out.println("Enter a number");
        int n=sc.nextInt();
        for(int i=1;i<n;i++){
            fact=n*i;
        }
        System.out.println("Factorial of given number is ->"+fact);

    }

    
}
