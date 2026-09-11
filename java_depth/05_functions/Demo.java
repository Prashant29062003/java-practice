public class Demo {
    public static void main(String[] args) {
        // Functions in java
        // 1. No input and no output
        greet();
        // 2. Input but no output
        greet("Prashant");
        // 3. No input but output
        System.out.println(getNum());
        // 4. Input and output
        System.out.println(getDetails("Prashant", 23));

        return; // optional
    }   
    // No input and no output
    static void greet(){
        System.out.println("Hello!");
        return;
    } 

    // input But no output
    static void greet(String name) {
        System.out.println("Hello " + name  + "!");
        return;
    }

    static String getDetails(String name, int age) {
        return name + " is " + age + " years old";
    }

    // no input but output
    static int getNum() {
        int c = (int)(Math.random() * 100);
        return c;
    }
}
