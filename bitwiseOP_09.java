public class bitwiseOP_09 {
    public static void main(String[] args) {

        // Bitwise && (AND) Oprator if both condition true then return true else false
        // means if even single condition false then return false

        int a = 5;
        int b = 6;
        System.out.println(a & b);

        // Bitwise || (OR) Operator return true even if one is 0 and one is 1 in binary
        // - Example

        int a1 = 5;
        int b2 = 9;
        System.out.println(a1 | b2);
        ;

        // Bitwise ^ (XOR) Exclusive OR . In this Bitwise XOR Operator answer will be 1
        // when bits are different other wise answer will be 0 means if bits are same
        // then answer will be 0

        int h = 5 ;
        int d = 3 ;
        System.out.println(h^d); 
    }
}
