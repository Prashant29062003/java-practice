import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check whether this is even OR odd:");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("number is even");
        }else{
            System.out.println("number is odd");
        }
        sc.close();
    }
}
