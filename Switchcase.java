import java.util.*;
public class Switchcase {
    public static void main(String[] args) {
        System.out.println("ENTER THE VALUE OF DAY");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        switch (n){
            case 1:
            System.out.println("monday");
            break;
            case 2:
            System.out.println("tuesday");
            break;
            case 3:
            System.out.println("wednesday");
            break;
            case 4:
            System.out.println("thursday");
            default:
            System.out.println("friday");
        }

        
    }
    
}
