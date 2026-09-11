public class Demo3 {
    public static void main(String[] args) {
        // Recursion
        // factorial
        System.out.println(fact(5));
        
        // Fibonacci
        System.out.println(fibnacci(5));

        // 1 - 10 counting
        count1toN(10);
        System.out.println("");
        // 10 - 1 counting
        countNto1(10);

    }

    static int fact(int n){
        // base case
        if( n == 1){
            return 1;
        }
        return n * fact(n-1);
    }

    static int fibnacci(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        return fibnacci(n-1) + fibnacci(n-2);
    }

    static void count1toN(int n){
        if(n == 0){
            return;
        }
        count1toN(n-1);
        System.out.print(n + " ");
    }
    static void countNto1(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        countNto1(n - 1);
    }
}
