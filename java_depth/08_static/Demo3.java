// use of String[] args
// 
public class Demo3 {
    public static void main(String[] args) {
        System.out.println("Number of arguments " + args.length);

        for (int i = 0; i < args.length; i++ ) {
            System.out.println("Argument " + i + " is " + args[i]);
        }

        // java Demo3 arg1 arg2 arg3
    }    
}
