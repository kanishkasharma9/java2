import java.util.Scanner;

public class Squarenatural {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        //int k=(n*(n+1)*(2*n+1))/6;
       // System.out.println(" "+k);
       int sum=0;
       for(int i=1;i<=n;i++) {
        sum+=i*i;

       }
       System.out.println(" "+sum);

    }
    
}
