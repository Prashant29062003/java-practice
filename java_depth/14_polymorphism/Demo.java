class Demo {
    public static void main(String[] args) {
        A a = new B();
        a.fun();
        // a.fun2(); // --> can not access private method
        System.out.println(a.x); // --> 10 comes from refernce of A

        

        // for B class
        B b = new B();
        b.fun();
        // b.fun2(); // --> can not access private method
        System.out.println(b.x); // --> 20 comes from refernce of B
    }
}

// polymorhism

// 1. static - static can not override
// They belong to class not to objects

// 2. private methods also can not override

// 3. final mehiods can not override

// 4. fields / variables are also not polymorphic

class A {
    int x = 10;
    static void fun (){
        System.out.println("Hello World from A.");
    }

    private void fun2 (){
        System.out.println("Private Hello World from A.");
    }

    final void fun3 (){
        System.out.println("final Hello world from A.");
    }

    int add (int a, int b){
        return a + b;
    }
}

class B extends A {
    int x = 20;
    static void fun (){
        System.out.println("Hello World from B.");
    }

    private void fun2 (){
        System.out.println("Private Hello World from B.");
    }

    // final can not override
    // final void fun3 (){
    //     System.out.println("final Hello world from B.");
    // }

    int add (double a, double b){
        return (int)(a + b);
    }
}