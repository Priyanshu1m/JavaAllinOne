
import java.util.*;

public class array {
    public static void main(String[] args) {
        /*int [] marks = new int [3];
        marks [0] = 1;
        marks [1] = 2;
        marks [2] = 3;
        System.out.println(marks[1]);

        int [] numbers = {67,23,56,88};
        System.out.println(numbers[3]);

        for (int i = 0;i<3;i++){
            System.out.println(marks[i]);
        }*/  //concept 1

        /*//Now if have to take the input of size from user
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int []numbers = new int [size];

        //Input
        for (int i = 0;i<size;i++){
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        //Output
        for (int i= 0;i<numbers.length;i++){
            if (numbers[i] ==x){
                System.out.println("x found at index: "+i);
            }
        }*/  //concept 2
        /*Scanner sc = new Scanner(System.in);
        int size  = sc.nextInt();
        String [] name = new String[size];

        //input
        for (int i = 0;i<name.length;i++){
            name[i] = sc.next();
        }

        //output
        for (int i = 0;i<name.length;i++){
            System.out.println("name "+(i+1)+" is: "+name[i]);
        }*/

        // 2D ARRAY'S //
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int [][] numbers = new int[rows][cols];
        //input
        //rows
        for (int i = 0;i< rows;i++){
            //columns
            for (int n = 0;n<cols;n++){
                numbers[i][n] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        for (int i = 0;i<rows;i++){
            for (int n = 0;n<cols;n++){
                if (numbers[i][n]==x){
                    System.out.println("X found at location ("+i+","+n+")");
                }
            }
        }

        /*//output
        for (int i = 0;i<rows;i++){
            for (int n = 0;n<cols;n++){
                System.out.print(numbers[i][n]+" ");
            }
            System.out.println();
        }*///output of the above syntax
    }
}

