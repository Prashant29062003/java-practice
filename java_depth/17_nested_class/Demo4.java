public class Demo4 {
    public static void main(String[] args) {

    }
}

class Outer4{
    void greet(){
        class Local{
            void sayHello (){
                System.out.println("Hello World.");
            }

            void sayBye(){
                System.out.println("Bye World.");
            }

            void wellWishes(){
                System.out.println("Well Wishes.");
            }
        }

        Local l = new Local();
        l.sayHello();
        l.sayBye();
        l.wellWishes();
    }
}

// NOTE: Where we can make these local classes
/*
1. Constructor
2. Method
3.Block (if, loop, static block etc.)
4. 
*/