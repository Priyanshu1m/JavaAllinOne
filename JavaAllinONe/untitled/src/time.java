import java.util.*;
public class time {
    public static void main(String args[]) {
        /*int[] marks = new int [3];
         syntax of arrays can be written in two ways
         int[] marks = new int [3];
         int marks[] = new int [3];*/
        /*
        marks[0] = 1;
        marks[1] = 2;
        marks[2] = 3;
        for (int i = 0; i<3;i++){
            System.out.println(marks[i]);
        }
        int secondWay[] = {97,98,95};
        for (int i = 0;i<3;i++){
            System.out.println(secondWay[i]);
        }*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        int number[] = new int[size];

        //inputf
        for (int i = 0;i<size;i++){
            System.out.println("Enter the value:");
            number[i] = sc.nextInt();
        }

        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();

        //output
        for (int i = 0; i<size;i++){
            System.out.println(number[i]);
        }

        for (int i = 0;i<size;i++){
            if (number[i] == x){
                System.out.println("x found at index: "+i);
            }
        }
    }
}
