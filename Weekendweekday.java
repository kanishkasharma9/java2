import java.util.Scanner;

public class Weekendweekday {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the day of week 1.monday 2.tuesday 3.wednesday 4.thursday 5.friday 6.saturday 7.saturday");
        int day=sc.nextInt();
        switch(day) {
            case 1:{
                System.out.println("weekday");
            }
            case 2:{
                System.out.println("weekday");
            }
            case 3:{
                System.out.println("weekday");
            }
            case 4:{
                System.out.println("weekday");
            }
            case 5:{
                System.out.println("weekday");
            }
            case 6:{
                System.out.println("saturday is weekend");
            }
            case 7:{
                System.out.println("sunday is weekend");
            }
            default:{
                System.out.println("invalid choice please enter correct options");
            }                                                                                                
        }

            
            
        

    }
    
}
