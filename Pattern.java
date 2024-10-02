public class Pattern {
    public static void main(String[] args) {

        // print square pattern in "numbers"
        // int n = 5;
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }

        // print square pattern using "*"

        int k = 5;
        for (int l = 0; l < k; l++) {
            for (int m = 0; m < k; m++) {
                System.out.print("*" + " ");
            }
            System.out.println();

        }


        //print square pattern in "number" but everytime numbers does not start with 0 or 1


        // int num = 1 ; int n = 5 ; 
        // for(int i = 0 ; i<n; i++){
        //     for(int j = 0 ; j<n; j++){
        //         System.out.print(num + " ");
        //         num++;
        //     }
        //     System.out.println();
        // }


            int n = 5 ; 
        for(int i = 0 ; i<n; i++){
            for(int j = 0 ; j<n; j+1){
                System.out.print("*"+ " ");
               
            }
            System.out.println();
        }
    }
}
