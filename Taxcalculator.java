import java.util.Scanner;

public class Taxcalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your income");
        double income=sc.nextDouble();
        
        
                if(income<=30000) {
                    double taxrate=0.25;
                    double taxamount=income*taxrate;
                    System.out.println("taxamount"+taxamount);
                }else if(income<=20000 && income>=30000) {
                        double taxrate=0.15;
                         double taxamount=income*taxrate;
                        System.out.println("taxamount"+taxamount);

                }else if(income<=10000 && income>=20000) {
                           double taxrate=0.10;
                            double taxamount=income*taxrate;
                            System.out.println("taxamount"+taxamount);
                }else{
                    if(income<=10000)
                    System.out.println("no tax"); 
                }    

            

        
    }
    
}
