// Call by reference --> there is no call by reference in java

public class Demo2 {
    public static void main(String[] args) {
        Random r1 = new Random(3, 9);

        System.out.println(addNums(r1));

        int a = 10, b = 19;
        System.out.println(a + " " + b);
        System.out.println("-------------");

        Swap s1 = new Swap(a,b);
        // System.out.println("Before Swap: " + s1.x + " " + s1.y);
        // System.out.println("-------------");
        swap(s1);
        System.out.println("After Swap: " + s1.x + " " + s1.y);

    }
    static int addNums(Random r){
        return r.x + r.y;
    }

    static void swap(Swap s){
        int temp = s.x;
        s.x = s.y;
        s.y = temp;
    }
}

class Random {
    int x, y ;

    Random (int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Swap {
    int x, y;

    Swap (int x, int y) {
        this.x = x;
        this.y = y;
    }
}