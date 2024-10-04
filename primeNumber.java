import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {

        // check prime number

       
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the user value which you want to check");

        int userInput = sc.nextInt();

        if(userInput<=1){
            System.out.println("UserInput is not prime :"+ userInput);
        }else{
           boolean  isPrime =true;
        

        for(int i = 2 ; i<Math.sqrt(userInput); i++){
            if(userInput%i==0){
                isPrime = false ;
                break;
            }
        }
            if(isPrime)
            {
                System.out.println("Number is prime : " + userInput);
            }

            else{
                System.out.println("Number is not prime : "+ userInput);
            }
        }
        sc.close();
       
        
    }
}
