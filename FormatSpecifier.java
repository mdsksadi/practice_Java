public class FormatSpecifier {
    public static void main(String[] args) {
        byte new_byte = 5;
        short new_short = 155;
        int new_int = 54545;
        long new_long = 464646466L;
        float new_float = 3.14f;
        double new_double = 3.14464466466;
        char new_char = 'a';
        boolean new_bool = true;

        // Integer types
        System.out.printf("new_byte: %d\n", new_byte);
        System.out.printf("new_short: %d\n", new_short);
        System.out.printf("new_int: %d\n", new_int);
        System.out.printf("new_long: %d\n", new_long);

        // Floating-point types
        System.out.printf("new_float: %f\n", new_float);
        System.out.printf("new_float (2 digits): %.2f\n", new_float);   // 2 digits after point
        System.out.printf("new_double: %f\n", new_double);
        System.out.printf("new_double (8 digits): %.8f\n", new_double); // 8 digits after point
        System.out.printf("new_double in scientific notation: %e\n", new_double);

        // Character and Boolean
        System.out.printf("new_char: %c\n", new_char);
        System.out.printf("new_bool: %b\n", new_bool);

        // Extra useful specifiers
        System.out.printf("new_int (hex): %x\n", new_int);   // Hexadecimal
        System.out.printf("new_int (octal): %o\n", new_int); // Octal
        System.out.printf("new_int (string): %s\n", new_int); // String format
    }
}
