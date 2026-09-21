public class Demo5 {
    public static void main(String[] args) {
        // 1. 
        // Person p1 = new Person("Prashant");
        // p1.introduce();

        // 2. 
        // Person p2 = new Guest("Adarsh");
        // p2.introduce();

        // 3. Anonymous class
        Person p3 = new Person("Prashant"){
            @Override 
            void introduce(){
                greet();
                System.out.println("Hello, my name is " + name);
            }

            void greet(){
                System.out.println("Hello guest!, my name is " + name);
            }
        };

        p3.introduce();
    }
}

class Person{
    String name;

    Person(String name){
        this.name = name;
    }

    void introduce(){
        System.out.println("Hello, my name is " + name);
    }
}

class Guest extends Person{
    Guest(String name){
        super(name);
    }

    @Override
    void introduce(){
        System.out.println("Hello guest!, my name is " + name);
    }
}