import java.util.Scanner;

public class Trafficlightsimulator {
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        System.out.println("enter the color of signal");
        String color=SC.nextLine();
        switch(color) {
            case "red":{
                System.out.println("stop!the light is red");
                color="green";
                System.out.println("next state:" +color);
                break;
            }
            case "yellow":{
                System.out.println("PREPARE TO STOP. THE LIGHT IS YELLOW");
                color="red";
                System.out.println("next state:" +color);
                break;
            }
            case "green":{
                System.out.println("GO!THE LIGHT IS GREEN");
                color="yellow";
                System.out.println("next state:" +color);
                break;
            }
            default:{
                System.out.println("invalid state");
            }
        }
    }
    
}
