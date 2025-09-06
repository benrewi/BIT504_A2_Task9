import java.util.Scanner;

public class TaskNine {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        
        double number = scanner.nextDouble();
        
        
        //changing the number to 90!
        double result = number * (number + 90);
        
        System.out.println(number + " × (" + number + " + 10) = " + result);
        
        scanner.close();
    }
}
