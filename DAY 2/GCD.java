import static java.lang.StrictMath.min;
import java.util.*;
public class GCD {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        int hcf=1;
        int n=min(a,b);
        for(int i=2;i<n;i++){
            if(a%i==0 && b%i==0){
                hcf=hcf*i;
                a=a/i;
                b=b/i;
            }
        }

        System.out.println("HCF is ->"+hcf);

    }
}
