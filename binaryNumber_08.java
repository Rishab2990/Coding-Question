import java.util.Scanner;

public class binaryNumber_08 {

    // Decimal To Binary

    public static int  Binary(int decimalNumber){
        int answer = 0 ;
        int power = 1;
        while (decimalNumber>0) {
            int remainder = decimalNumber%2 ;
              decimalNumber /=2 ;

              answer += (remainder*power);
              power*=10 ;
        }
        return answer ;
    }

    // Binary To Decimal

    public static int Decimal(int BinaryNumber){

        int answer = 0 ; 
        int power = 1 ; 
        while (BinaryNumber>0) {
            int remainder = BinaryNumber%10 ;
             answer+=(remainder*power);

             BinaryNumber/=10 ;
             power*=2;
             
            }
            return answer ;
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value :");
        int userInput = sc.nextInt();

        System.out.println(Binary(userInput));

        System.out.println(Decimal(userInput));
     
    }
}
