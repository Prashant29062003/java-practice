// Wrapper classes
// 1. int -> Integer
// 2. float -> Float
// 3. double -> Double
// 4. char -> Character
// 5. boolean -> Boolean
// 6. String -> String


// Autoboxing
// Unboxing

// 1. Assignment
// 2. Method Calls
// 3. Arithemetic Operations

public class Demo {
    public static void main(String[] args) {
        // Autoboxing
        Integer x = 10;
        Integer y = x; // Autoboxing
        // Integer y = Integer.valueOf(x); // --> same as above
        
        System.out.println(x);
        System.out.println(y); // Unboxing

        // Unboxing
        // Integer a = Integer.valueOf(20);
        Integer a = 20; // autoboxing
        int b = a; // unboxing

        System.out.println(a); // unboxing
        System.out.println(b);

        // through methods
        Integer c = 30; // autoboxing
        printInteger(c);

        // Examples
        Integer p = 10; // autoboxing
        Integer q = 39; // autoboxing

        int sum = p + q; // unboxing
        // int sum = p.intValue() + q.intValue(); // --> same as above
        System.out.println(sum);


        // Note: null pointer exception
        // Integer x1 = null;
        // int y1 = x1;
        // System.out.println(y1);
        /*
        *
        * Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because "<local9>" is null
        *                at Demo.main(Demo.java:50)
        * 
        */

        System.out.println(p.intValue() == x.intValue());
    }    

    static void printInteger(int x){ // unboxing
        System.out.println(x);
    }
}
