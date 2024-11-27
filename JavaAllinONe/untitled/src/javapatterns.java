import java.util.*;
public class javapatterns {
    public static void main(String[] args) {
        Scanner xx = new Scanner(System.in);
        System.out.print("Enter the number between 1 to 14: ");
        int menu = xx.nextInt();
        switch (menu){
            case 1:
                Scanner sc = new Scanner (System.in);
                System.out.println("Enter the first number: ");
                int m = sc.nextInt();
                System.out.println("Enter the second number: ");
                int f = sc.nextInt();
                firstPattern(m,f);
                break;

            case 2:
                System.out.println("Enter the first number: ");
                int a = 4;
                System.out.println("Enter the second number: ");
                int b = 5;
                secondPattern(a,b);
                break;

            case 3:
                int c = 5;
                thirdPattern(c);
                break;

            case 4:
                int d =4;
                forthPattern(d);
                break;

            case 5:
                int e = 4;
                fifthPattern(e);
                break;

            case 6:
                int g = 5;
                sixthPattern(g);
                break;

            case 7:
                int h = 5;
                seventhPattern(h);
                break;

            case 8:
                int k = 5;
                eightPattern(k);
                break;

            case 9:
                int l = 5;
                ninthPattern(l);
                break;

            case 10:
                int o = 5;
                tenthPattern(o);
                break;

            case 11:
                int p = 5;
                eleventhPattern(p);
                break;

            case 12:
                int q = 5;
                twelfthPattern(q);
                break;

            case 13:
                int r = 5;
                thirteenthPattern(r);
                break;

            case 14:
                int s = 4;
                fourteenthPattern(s);
                break;

            default:
                System.out.println("Try again");
        }

    }
    public static void firstPattern(int m, int f) {

        //outer loop
        for (int i = 1; i <= m; i++) {
            //inner loop
            for (int n = 1; n <= f; n++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void secondPattern(int a, int b) {
        //outer loop
        for (int i = 1; i <= a; i++) {
            //inner loop
            for (int j = 1; j <= b; j++) {
                if (i == 1 || j == 1 || i == a || j == b) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void thirdPattern(int c){
        for (int i =1; i<=c;i++){
            for (int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void forthPattern(int d){
        for(int i = d; i>=1; i--){
            //inner loop
            for (int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void fifthPattern(int e){
        for (int i = 1;i<=e;i++){
            //inner loop -> space print
            for (int j= 1; j<=e-1; j++){
                System.out.print(" ");
            }
            //inner loop ->star print
            for (int j=1; j<=i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void sixthPattern(int g){
        for (int i =1; i<=g;i++){
            for (int j = 1; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void seventhPattern(int h){
        for (int i =1; i<=h;i++){
            for (int j = 1; j<=h-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void eightPattern(int k){
        int number = 1;

        for (int i = 1; i<=k;i++){
            for (int j = 1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
    public static void ninthPattern(int l){
        for (int i = 1; i<=l; i++){
            for (int j =1;j<=i;j++){
                int sum = i+j;
                if (sum%2==0){
                    System.out.print("1 ");
                }else {
                    System.out.print("0  ");
                }
            }
            System.out.println(  );
        }
    }
    public static void tenthPattern(int o){
        //upper half
        for (int i = 1;i<=o; i++){
            //1st part
            for (int j = 1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            int spaces = 2*(o-i);
            for (int j = 1; j<=spaces;j++){
                System.out.print(" ");
            }
            //2nd part
            for (int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Lower half
        for (int i = o;i>=1; i--){
            //1st part
            for (int j = 1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            int spaces = 2*(o-i);
            for (int j = 1; j<=spaces;j++){
                System.out.print(" ");
            }
            //2nd part
            for (int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void eleventhPattern(int p){
        for (int i =1;i<=p;i++){
            //spaces
            for (int j=1;j<=p-i;j++){
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j<=p;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void twelfthPattern(int q){
        for (int i = 1;i<=q;i++){
            //spaces
            for (int j = 1;j<=q-i;j++){
                System.out.print(" ");
            }
            //number -> Print row number, row number times
            for (int j = 1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void thirteenthPattern(int r){
        for (int i = 1; i<=r; i++){
            //spaces
            for (int j=1; j<=r-i; j++ ){
                System.out.print(" ");
            }
            //1st half numbers
            for (int j = i; j>=1; j--){
                System.out.print(j);
            }
            //2nd half numbers
            for (int j=2; j<=i; j++){
                System.out.print(j);

            }
            System.out.println();
        }
    }
    public static void fourteenthPattern(int s){
        //upper half
        for (int i = 1;i <= s;i++){
            //spaces
            for (int j = 1;j<=s-i;j++){
                System.out.print(" ");
            }
            //numbers
            for (int j = 1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //  lower half
        for (int i = s;i>= 1;i--){
            //spaces
            for (int j = 1;j<=s-i;j++){
                System.out.print(" ");
            }
            //numbers
            for (int j = 1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }



    //**********The End***********//

}
