import java.util.Scanner;

public class TaskNine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        double result = number * (number + 10);
        System.out.println(number + " × (" + number + " + 10) = " + result);
        scanner.close();
    }
}
