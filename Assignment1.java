/**
 * Assignment1
 */
import java.util.*;

public class Assignment1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First number:");
        int a = scanner.nextInt();
        System.out.println("Enter the Second number:");
        int b = scanner.nextInt();

        System.out.println("Select an operation to perform:\n1. Add\n2. Substract\n3. Multiply\n4. Divide");
        System.out.println("Please Enter the option number:");
        int option = scanner.nextInt();
        int result = 0;

        switch (option) {
            case 1:
                result = a + b;
                break;
            
            case 2:
                result = a - b;
                break;

            case 3:
                result = a * b;
                break;
            
            case 4:
                result = a / b;
                break;
        
            default:
                System.out.println("Incorrect option selected!");
                break;
        }
        System.out.println("The Result is: " +result);
    }
}