class Display {
    void show(int a) {
        System.out.println("Integer: " + a);
    }

    void show(String s) {
        System.out.println("String: " + s);
    }

    void show(double d) {
        System.out.println("Double: " + d);
    }
}

public class program6 {
    public static void main(String[] args) {
        Display obj = new Display();

        obj.show(10);
        obj.show("Java");
        obj.show(25.5);
    }
}
