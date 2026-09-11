public class Demo2 {
    public static void main(String[] args) {
        // Functions Overloading in java
        // 1. same name but different parameters
        System.out.println(sum(3, 435)); // sum(0, 0);
        // 2. same name but different return type
        System.out.println(sum(5, 2, 9)); // sum(0, 0, 9);
        System.out.println(sum(5.90, 2.90)); 

    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) { // diff no. of parameters
        return a + b + c;
    }

    static int sum(double a, double b) {  // diff return types of parameters
        return (int) (a + b);
    }

    static String greet (String name, int age){  // diff order of parameters
        return "Hello " + name + " you are " + age + " years old";
    }
    static String greet (int age, String name){ // diff order of parameters
        return "Hello " + name + " you are " + age + " years old";
    }
}
