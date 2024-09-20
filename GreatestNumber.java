class GreatestNumber{
    public static void main(String[] args) {
        int a = 23;
        int b = 13;
        int c = 2;
        if(a>b && a>c){
            System.out.println("Greatest number is " + a);
        }
        else if(b>a && b>c){
            System.out.println("Greatest number is " + b);
        }else{
            System.out.println("Greatest number is " + c);
        }
        
    }
}