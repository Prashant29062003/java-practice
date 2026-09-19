public class Demo2 {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.makeSound();
        c1.sleep();

        System.out.println("-------------------------");

        Cat c2 = new Cat("Billi mausi");
        c2.sleep();
        c2.petCall();
        c2.makeSound();
        
    }
}

abstract class Animal {
    private String name;
    static String eyes; // --> only example of having static in abstract class

    Animal (){}
    Animal (String n){
        this.name = n;
    }
    abstract void makeSound();

    void sleep (){
        if(name != null){
            System.out.println(name + " is sleeping");
        }
        else{
            System.out.println("Sleeping");
        }
    }

    static void checkEyes(){
        System.out.println("Blue eyes hipnotyse kar di ye menu.");
    }

    void petCall(){
        System.out.println("Comon here " + name);
    }
}

class Cat extends Animal {

    Cat() {

    }
    Cat(String name){
        super(name);
    }
    @Override 
    void makeSound(){
        System.out.println("Cat is saying Meou meou..!");
    }
}

// # Abstract Classes

// 1. Cannot be instantiated directly.
// 2. Can contain abstract method (method without implementation)
// 3. Can also contain normal methods.
// 4. Is meant to be extended.

// Questions:
// 1. Can abstract classes have constructors? --> Yes, as abstract class never be instantiated and we have to make instance of child class which have constructor and when it calls its constructor it also calls it's parent's class which first calls its constructor.

// 2. Can abstract class be final? --> No, as abstract class can't be instantiated so we must have to inherit this in other calss to use it, if we make it final it becomes unreachable.

// 3. Can abstract class have static methods/variables etc. ? --> Yes

// 4. private method are allowed? --> Yes, but non abstsract

// 5. Can abstract method have final method? --> Yes, but non abstsract

// 6. Can abstract class have no abstract methods? --> Yes allowed, (use case we don't want to make instance anyone)