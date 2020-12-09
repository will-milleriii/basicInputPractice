import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int a = scanner.nextInt();

        System.out.println("Enter another number to multiply by: ");
        int b = scanner.nextInt();

        System.out.println(multiply(a, b));

    }

    public static int multiply(int a, int b){
        return a * b;
    }
}
