// Nested classes
// Types:
// 1. Static nested class


// Advantages
// 1. Logical grouping
// 2. Better access to outer class

// 1. Inner class can access static members of outer class
// 2. Outer class can access static members of inner class
// 3. Inner class can access non-static members of outer class

// Use cases of static nested class
/*
 1. As helper class for any outer class.
 2. Builder design pattern
 3. if you want to have static methods inside a nested class
 4. Request/Response DTO
*/

public class Demo {
    public static void main(String[] args) {
        Outer outer = new Outer();

        Outer.Inner in1 = new Outer.Inner(outer);
        in1.fun();
    }
}

// 1. Static nested class
class Outer {
    private static int x = 10;  // accessible for this class instead of object
    int y = 37; // accessible for this object instead of class

    static class Inner { // same is this also

        Outer o;

        Inner (Outer outer){
            this.o = outer;
        }

        static int num;

        void fun(){
            System.out.println(x);
            // System.out.println(y); // Cannot make a static reference to the non-static field y
            System.out.println(o.y); // can be accessbile if we use outer class's object
        }

        static void fun2(){
            System.out.println(num);
        }
    }
}