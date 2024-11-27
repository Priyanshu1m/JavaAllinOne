import java.util.*;
public class isPrime{
    public static boolean isPrime(int number){
        if (number <= 1){
            return false;
        }
        for (int i = 2;i<number; i++){
            if (number%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.print("Enter your Number here: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (isPrime(number)){
            System.out.println(number+" is a Prime Number.");
        }else {
            System.out.println(number+" is not a Prime Number.");
        }
    }
}