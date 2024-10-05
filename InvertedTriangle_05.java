public class InvertedTriangle_05 {
    public static void main(String[] args) {
        
        int numbers = 4 ;
        for(int i = 1 ; i<=numbers; i++){
            for(int j = 1 ; j<=i; j++){
            System.out.print(" ");
        }
        for(int j = 0; j<=numbers-i; j++){
            System.out.print(i+1);
        }
        System.out.println();
        }
    }
}
