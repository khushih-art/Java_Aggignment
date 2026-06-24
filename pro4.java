public class program4 {

    // Method to multiply two integers
    int multiply(int a, int b) {
        return a * b;
    }

    // Method to multiply three integers
    int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // Method to multiply two floating-point numbers
    double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        program4 obj = new program4();

        System.out.println("Multiplication of two integers: " +
                obj.multiply(5, 4));

        System.out.println("Multiplication of three integers: " +
                obj.multiply(2, 3, 4));

        System.out.println("Multiplication of two floating-point numbers: " +
                obj.multiply(2.5, 4.0));
    }
}
