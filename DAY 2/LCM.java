
import java.util.*;
public class LCM {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        System.out.println("enter second number");
        int b=sc.nextInt();
        System.out.println("LCM of"+a+ "and" +b+ "is"+findLCM(a,b));
    }

        static int findGCD(int a,int b){
            if(a==0)
            return b;
            return findGCD(b%a,a);
        }

        static int findLCM(int a,int b){
            return(a/findGCD(a,b))*b;
        }
    }

