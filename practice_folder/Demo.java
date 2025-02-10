package practice_folder;
import java.util.Scanner;
public class Demo{
    public static void main(String a[]){
        // int i=1;
        // Scanner myObj = new Scanner(System.in);
        // int my_first_input = myObj.nextInt();
        // System.out.println("Input is " + my_first_input);
        // for(int j=0;j<my_first_input;j++){
        //     i+=5;
        // }
        // System.out.println("Value of i is " + i);
        int array[] = new int[4];
        Scanner myobj = new Scanner(System.in);
        for(int i=0;i<4;i++){
            System.out.println("Give input of "+(i+1)+" number");
            array[i] = myobj.nextInt();
        }
        myobj.close();
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]+28821);
        }


    }
}