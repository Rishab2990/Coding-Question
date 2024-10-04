import java.util.*;
public class oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int value = sc.nextInt();

        if (value % 2 == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }

    }

}