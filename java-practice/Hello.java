public class Hello{
    public static void main(String args[]){
        System.out.println("Hello World!");

        // literals

        int binary = 0b101;
        System.out.println(binary); // ==> 5

        int hex = 0x101;
        System.out.println(hex);    // ==> 257

        int num = 10_00_00_000;
        System.out.println(num);    // ==> 100000000
        
        double num1 = 12e10;
        System.out.println(num1);   // ==> 1.2E11
        
        char c = 'p';
        c++;
        System.out.println(c);  // ==> q


        // type casting

        byte b = 127;
        int a = 12;

        // b = a;   // ==> not possible i.e.b is smaller than a 
        b = (byte)a;
        System.out.println(b);
        
        a = b;
        System.out.println(a);

        float f = 5.6f;
        int x = (int)f;
        System.out.println(x);

    }
}