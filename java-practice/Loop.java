
public class Loop {
    public static void main(String args[]) {
        int i = 1;

        while(i<=4){
            System.out.print(i);
            int j = 1;
            while(j<=3){
                System.out.println("\t hello Prashant!");
                j++;
            }
            System.out.println("");

            i++;
        }
        System.out.println("HELLO"+ i);

        for(int p= 1; p<=5;p++){
            System.out.println("DAY "+ p);
            for(int j=1;j<=9;j++){
                System.out.println("  "+(j+8) + " - "+ (j+9));
            }
            System.out.println("");
        }
    }

}
