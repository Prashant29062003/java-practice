public class Demo {
    // Call by value
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        System.out.println("x = " + x + ", y = " + y);
        swap(x, y);
        System.out.println("x = " + x + ", y = " + y );
    }

    static void swap (int x, int y){
        int temp = x;
        x = y;
        y = temp;
    }
}
