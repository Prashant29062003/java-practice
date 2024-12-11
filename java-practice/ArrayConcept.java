
public class ArrayConcept {

    public static void main(String[] a) {
        // Static Array
        // int num[] = {5,6,2,98};

        // System.out.println(num[3]);

        // Dynamic Array
        // int num[] = new int[4];
        // num[0]= 4;
        // num[1]= 7;
        // for(int i=0;i<=num.length;i++){
        //     System.out.println(num[i]);
        // }

        // MUltidimensional array

        int nums[][] = new int[3][4];

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                nums[i][j] = (int)(Math.random()*11);
            }
        }

        // one way by traditional for loop
        System.out.println("Using traditional for loop: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        // second way by other for loop method(called  enhanced for loop)
        System.out.println("Using enhanced for loop: ");
        for(int n[] : nums){
            for(int m : n){
                System.out.print(m+ " ");
            }
            System.out.println();
        }

        // jagged array
        int num2[][] = new int[3][];

        // here we are individually declared colums
        num2[0] = new int[3];
        num2[1] = new int[5];
        num2[2] = new int[4];

        System.out.println("Using jagged Array: ");
        for(int i = 0;i<num2.length;i++){
            for(int j=0;j<num2[i].length;j++){
                num2[i][j] = (int)(Math.random()*101);
            }
        }

        for(int[] n : num2){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
