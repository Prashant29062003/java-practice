
public class GreatestNumber {
    static double greatestNum(double x, double y, double z){
        if(x>y && x>z){
            return x;
        }else if(y>z){
            return y;
        }else{
            return z;
        }
    }
    public static void main(String args[]) {
        double largest = greatestNum(12,3,11);
        System.out.println("largest number is "+ largest);

    }
}
