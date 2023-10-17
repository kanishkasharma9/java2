import java.util.Scanner;

public class ultarighttrianglt {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int k=sc.nextInt();
        for(int i=0;i<k;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<k-i;j++){
                System.out.print("*");

            }
            System.out.println();
            
        }
        
    }
    
}
