public class Demo {
    public static void main(String args[]) {
        System.out.println("Hello World!");

        // Integers --> byte, short, int, long
        // byte b = 127;
        byte b = 07;   // octal --> 0 - 7
        // byte b1 = 0X07;   // hexadecimal --> 0 - 9, A, B, C, D, E, F (1 - 15)
        short s = 20;
        int i = 10;
        long l = 10000000000L;
        System.out.println("Integer Values: " + b + ", " + s + ", " + i + ", " + l);

        // Real Number
        float f = 10.03f;
        double d = 10.02932032d;
        System.out.println("Real Number Values: " + f + ", " + d);

        // Character
        char c = 'r';
        System.out.println("Character Values: " + c);

        // Boolean
        boolean bool = true;
        System.out.println("Boolean Values: " + bool);

        // String
        String name = "Prashant";
        System.out.println("String Values: " + name);

        // Operators
        int x = 10, y = 20, z = 30, p = 40, q = 50, r = 60, ss = 70, t = 80, u = 90, v = 100;
        System.out.println("Operators: " + (x + y) + ", " + (z - p) + ", " + (q * r) + ", " + (ss / t) + ", " + (u % v));

        // Bitwise Operators
        System.out.println("Bitwise Operators: " + (x & y) + ", " + (x | y) + ", " + (x ^ y) + ", " + (~x) + ", " + (x << 2) + ", " + (x >> 2));

    }
}