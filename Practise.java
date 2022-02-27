import java.util.Scanner;

public class Practise {
    
    public static void main(String[] args) {
        sum();
    }

    static void sum() {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter num1: ");
        int num1 = input.nextInt();
        System.out.print("Enter num2: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }

    static int add() {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter num1: ");
        int num1 = input.nextInt();
        System.out.print("Enter num2: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        return sum;
    }
    
}
