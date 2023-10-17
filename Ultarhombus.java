import java.util.Scanner;

public class Ultarhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int ob=sc.nextInt();
        for(int i=0;i<ob;i++){
            for(int j=0;j<i;j++){
                
                    System.out.print(" ");
                
            }
            for(int j=0;j<ob;j++){
                
                    System.out.print("*");
                
            }
            System.out.println();
            
        
        }
    }
    
}
