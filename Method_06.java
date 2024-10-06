import java.util.Scanner;

public class Method_06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int firstInput = sc.nextInt();
        int secondInput = sc.nextInt();
        int thirdInput = sc.nextInt();

        if (firstInput > secondInput && firstInput > thirdInput) {
            System.out.println("Greatest Value : " + firstInput);

        } else if (secondInput > firstInput && secondInput > thirdInput) {
            System.out.println("Greatest Value : " + secondInput);
        } else {
            System.out.println("Greatest Value : " + thirdInput);
        }

    }
}
