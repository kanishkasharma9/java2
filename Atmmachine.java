import java.util.Scanner;

public class Atmmachine {
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        double balance=1000.0;
        System.out.println("WELCOME TO THE ATM");
        System.out.println("CHECK BALANCE");
        System.out.println("2.WITHDRAW");
        System.out.println("3.DEPOSTE");
        System.out.println("4.EXIT");
        System.out.println("ENTER YOUR CHOICE");
        int choice=SC.nextInt();
        switch(choice) {
            case 1:{
                System.out.println("your balance is:"+balance);
                break;
            }
            case 2:{
                System.out.println("enter the value to be withdraw from balance");
                double withdraw=SC.nextDouble();
                if(withdraw>=balance) {
                    System.out.println("cannot withdraw because balance is minimum");
                }else{
                    balance-=withdraw;
                    System.out.println("your remaining balance after withdraw is:"+balance);
                }
                break;

            }
            case 3:{
                System.out.println("enter the value to be deposite");
                double deposite=SC.nextDouble();
                balance+=deposite;
                System.out.println("your balance become after deposite"+balance);
                break;
            }
            case 4:{
                System.out.println("thankyou for using atm hava a good day");
                break;
            }
            default:{
                System.out.println("invalid options");
            }
        }


    }
    
}
