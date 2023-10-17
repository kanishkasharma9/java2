import java.util.Scanner;
public class Functionsalary {
    static Float Hra(Float basic_salary,int perhra){
       float HRA=basic_salary*perhra/100;
       return HRA;
    }
    static Float Ta(Float basic_salary,int perta){
        float TA=basic_salary*perta/100;
        return TA;
    }
    static Float da(float basic_salary, int perda){
        float DA=basic_salary*perda;
        return DA;
    }

    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("basic salary");
        Float basic_salary=sc.nextFloat();
        System.out.println("enter the Percent for ta");
        int perta =sc.nextInt();
        System.out.println("enter the percent for hra");
        int perhra=sc.nextInt();
        System.out.println("enter the percent for da");
        int perda=sc.nextInt();
        System.out.println("enter the percent for pf");
        int pf =sc.nextInt();
        Float HRAoperation=Hra(basic_salary,perhra);
        Float taoperation=Ta(basic_salary,perta);
        Float daoperation=da(basic_salary,perda);
        float net_salary=basic_salary+HRAoperation+taoperation+daoperation-pf;
        System.out.println("BASIC SALARY:"+basic_salary);
        System.out.println("HRA:"+HRAoperation);
        System.out.println("DA:"+daoperation);
        System.out.println("TA:"+taoperation);
        System.out.println("netsalary:"+net_salary);


        
    }
    
}
