import java.util.Scanner;

public class SumOneToN{
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the Value " + " ");
      // int userInput = sc.nextInt();
      int userInput[] = {1,2,3,4,5,6,7,8,9};
        int sumValue = 0 ;
        for(int i = 0 ; i<userInput.length;  i++){
            sumValue +=userInput[i];
        }
        System.out.println("The total value : " + sumValue);
    }
}