import java.util.Scanner;

// Find out the average of three numbers
public class averageCalculateMethod_07 {

    public static double AverageNumber(int firstInput, int secondInput, int thirdInput) {

        return (firstInput + secondInput + thirdInput) / 3.0;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers ");
        int firstInput = sc.nextInt();
        int secondInput = sc.nextInt();
        int thirdInput = sc.nextInt();

        double answer = AverageNumber(firstInput, secondInput, thirdInput);
        System.out.println("The average of a numbers : " + answer);
        sc.close();

    }
}
