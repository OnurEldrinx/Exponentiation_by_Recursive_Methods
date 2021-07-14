import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the base value : ");
        int base = keyboard.nextInt();

        System.out.print("Enter the exponent value : ");
        int exponent = keyboard.nextInt();


        System.out.println("POWER(" + base + "," + exponent + ") = " + power(base,exponent));

    }

    static int power(int base,int exponent){

        if (exponent != 0) {
            return base * power(base, exponent - 1);
        }else{
            return 1;
        }

    }

}
