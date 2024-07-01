import java.util.Scanner;
public class Demo{
    public static void main(String a[]){
        int i=1;
        Scanner myObj = new Scanner(System.in);
        int my_first_input = myObj.nextInt();
        System.out.println("Input is " + my_first_input);
        for(int j=0;j<my_first_input;j++){
            i+=5;
        }
        System.out.println("Value of i is " + i);
    }
}