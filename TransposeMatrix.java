public class TransposeMatrix {
    static final int M = 3;
    static final int N = 4;

    static void transpose(int A[][], int B[][]){
        for(int i = 0; i<N;i++){
            for(int j=0;j<M;j++){
                B[i][j] = A[j][i];
            }
        }
    }

    public static void main(String[] args) {

        int A[][] = { {1,1,1,1}, {2,2,2,2}, {3,3,3,3}};
        int B[][] = new int[N][M];

        transpose(A,B);

        System.out.println("Actual matrix:");
        for(int n[] : A){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
        System.out.println("--------------");
        System.out.println("Transpose of A matrix in B:");
        for(int n[] : B){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }
}
