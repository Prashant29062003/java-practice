public class Demo3 {
    public static void main(String[] args) {
        
        // 1. 
        // Outer.Inner inner = new Outer.Inner();
        
        // 2. this is best if we want to all access from outer and inner class
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();

        // 3. in this if we want to access only inner class
        // Outer.Inner inner = new Outer().new Inner();

        inner.fun();
        // inner.fun2(); // The static method fun2() from the type Outer.Inner should be accessed in a static way --> Warning
        Outer.Inner.fun2();

    }
}

class Outer {
    int x = 10;
    class Inner{
        int x = 20;
        void fun(){
            System.out.println("Hello World.");
            System.out.println("Inner x = " + x);
            System.out.println("Outer x = " + Outer.this.x);
        }


        // before java 16 has not contain static members for inner class

        static void fun2(){
            System.out.println("Static fun2.");
        }
    }
}


