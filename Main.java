import java.util.Scanner;

public class Main {
    public static void main(String[] args) { // String[] arg : command line arguments

        //System.out.println("Hello World!");
        //System.out.println(args[1]);
        Scanner input = new Scanner(System.in);
        //System.out.println(input.nextLine());
        //input.close();
        String fruit = input.next();

        switch(fruit) {
            case "Mango":
                System.out.println("M");
            break;
        }

    
    }
}