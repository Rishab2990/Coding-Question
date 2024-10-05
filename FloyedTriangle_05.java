public class FloyedTriangle_05 {
    public static void main(String[] args) {
        int TempValue = 1 ; 
        int number = 4 ;
        for(int i = 0 ; i<number; i++){
            for(int j = 0 ; j<i+1; j++){
                System.out.print(TempValue + " ");
                TempValue++;
            }
            System.out.println();
        }
    }
    
}
