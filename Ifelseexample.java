import java.util.*;
 public class Ifelseexample {
    public static void main(String[] args) {
        System.out.println("enter the value of age");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        if(n<12){
            System.out.print("child");
        }else if(12<=n ||n<=20){
            System.out.println("tenager");
        }else{
            System.out.println("Adult");
        }

        
    }
    
}
