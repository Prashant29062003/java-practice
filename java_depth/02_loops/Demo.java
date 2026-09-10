public class Demo {
    public static void main (String args[]) {
        // int i = 5;
        // while (i <= 10) {
        //     System.out.println(i);
        //     i++;
        // }
        // System.out.println(i);

        // for (int i = 0; i < 10; i++) {
        //     System.out.println("Hello World!");
        // }

        // Infinite loop
        // for (; ; ) {
        //     System.out.println("Hello World!");
        // }

        // Comma seperated variations
        // for (int i = 0, j = 0; i < 10 && j <= 5; i++, j++) {
        //     System.out.println("Square of " + i + " is " + i * j);
        // }

        // boolean b = true;
        // for (int i = 0; b == true; i++){
        //     if(i == 100) {
        //         b = false;
        //     }
        //     System.out.println(i);
        // }


        // Integers => byte, short, int, long

        // Nested loops
        for (int i = 1;i <= 10; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

        // Jump statements
        // break, continue

        boolean b = false;
        for (int i = 1; i <=10; i++){
            System.out.println(i);
            if (i == 3 * 3){
                b = true;
            }
            if(b == true){
                break;
            }
        }

        // whwther the number is prime or not
        int num = 7;
        int i;
        for (i = 2; i < num; i++){
            if(num % i == 0){
                System.out.println(num + " is not a prime.");
                break;
            }
        }
        if(num == i){
            System.out.println(num + " is a prime.");
        }
    }
}