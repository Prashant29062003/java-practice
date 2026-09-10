public class Demo {
    public static void main(String[] args) {
        int[] rollNums = new int[3];
        int x = 101;
        for (int i = 0; i < rollNums.length; i++) {
            rollNums[i] = x;
            x++;
        }

        // rollNums[0] = 101;
        // rollNums[1] = 102;
        // rollNums[2] = 103;
        for (int i = 0; i < rollNums.length; i++) {
            System.out.println(rollNums[i]);
        }

        // Two D Array
        // int[][] marks = new int[3][3];
        int[][] marks = {
                { 23, 45, 90 },
                { 56, 78, 90 },
                { 12, 34, 56 }
        };
        // for (int i = 0; i < marks.length; i++) {
        //     for (int j = 0; j < marks[i].length; j++) {
        //         marks[i][j] = (int) (Math.random() * 100);
        //     }
        // }

        for (int i = 0; i < marks.length; i++){
            for (int j = 0; j < marks[i].length; j++ ){
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }
}