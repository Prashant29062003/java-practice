import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number to check whether it is armstrong or not:");
        int num = sc.nextInt();
        int len = 0;
        int temp = num;
        while(temp!=0){
            temp = temp/10;
            len++;
        }

        temp = num;
        int sum =0;
        while(temp!=0){
            int rem = temp%10;
            sum += Math.pow(rem, len);
            temp = temp/10;
        }
        if(sum == num){
            System.out.println(num +" is armstrong.");
        }else{
            System.out.println(num +" is not armstrong.");

        }

        sc.close();
    }
}
