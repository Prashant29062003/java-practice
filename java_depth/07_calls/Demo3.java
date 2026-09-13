public class Demo3 {

    public static void main(String[] args) {
        Random2 r1 = new Random2(4,9);
        Random2 r2 = new Random2(r1); // --> Deep copy
        Random2 r3 = r2; // --> Shallow copy
    }
}

class Random2{
    int x, y;
    Random2 (int x,int y){
        this.x = x;
        this.y = y;
    }

    Random2(Random2 r){
        this.x = r.x;
        this.y = r.y;
    }

}