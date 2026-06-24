class Printer {

    // Print integer
    void print(int num) {
        System.out.println("Integer: " + num);
    }

    // Print string
    void print(String text) {
        System.out.println("String: " + text);
    }

    // Print array of integers
    void print(int arr[]) {
        System.out.print("Array Elements: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}

public class program2 {
    public static void main(String[] args) {

        Printer p = new Printer();

        // Calling overloaded methods
        p.print(100);

        p.print("Hello Java");

        int numbers[] = {10, 20, 30, 40, 50};
        p.print(numbers);
    }
}

