import java.util.*;
 public class Functionarrayrotation {
    public void rotate(int[]array,int K){
        reverse(array,0,array.length);
        reverse(array,0,K-1);
        reverse(array,K,array.length);
    }

    public void reverse(int[]array,int Start,int End){
        while(Start<End){
            
                while(Start<End){
                    Temp=array[Start];
                    array[Start]=array[End];
                    array[End]=Temp;
                    Start++;
                    End--;
                }
        }
    }
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6};
        int n= array.length;
        int Temp=0;
        int Start=0;
        int End=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of k");
        int K=sc.nextInt();
        obj.rotation(int array,int K);

            

        


    }
}
