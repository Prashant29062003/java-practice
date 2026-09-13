public class Demo2 {
    public static void main(String[] args) {
        Random r1 = new Random();
        System.out.println(r1.PI);

        final int x;
        x = 29;
        System.out.println(x);
    }
}

// Why main is static in java ?? 
// Demo2 d1 = new demo2;
// d1.main();
// Demo2.main();

class Random {
    final static double PI;

    static {
        PI = 3.14;
    }
}