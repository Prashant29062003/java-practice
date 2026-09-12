// Default values
/*
Integer --> 0
float --> 0.0
double --> 0.0
String --> null (nothing)
*/


class Student {
    String name; // information/data/characteristics --> instance variables
    int age;
    int rollno;
    String stream;
    String college;
    int marks;

    // Constructor
    // Rules for constructor in java

    // 1. no return type, not even void
    // 2. same name as class name
    // 3. no static
    // 4. automatic called during object creation
    // 5. Used to initialize an object
    // 6. It can also be overloaded

    Student(String n, int a, int r, String s, String c, int m) { // parameterized constructor --> constructor overloading
        name = n;
        age = a;
        rollno = r;
        stream = s;
        college = c;
        marks = m;
    }
    Student() { // default constructor --> no parameters
        
    }

    void markAttendence() { // behaviours --> functions --> instance methods
        System.out.println("Attendence marked by : " + name);
    }

    void print(){
        System.out.println("name: " + name + ", age: " + age + ", rollno: " + rollno + ", stream: " + stream + ", college: " + college +  ", marks: " + marks);
    }
}

public class Demo {
    public static void main(String[] args) {

        int x = 7; // primitive data type --> local variable

        // OOPs Concepts
        Student s1 = new Student(); // Object creation and memory allocation at runtime
        s1.name = "Prashant Kumar";
        s1.age = 23;
        s1.rollno = 242;
        s1.stream = "ECE";
        s1.college = "IIT Madras";
        s1.marks = 100;

        s1.markAttendence();
        s1.print();

        System.out.println("------------------");
        Student s2 = new Student(); // 
        s2.name = "Ved Prakash";
        s2.age = 22;
        s2.rollno = 243;
        s2.stream = "Medical";
        s2.college = "Russian University";
        s2.marks = 98;

        s2.markAttendence();
        s2.print();
        
        System.out.println("------------------");

        Student s3 = new Student("Rahul", 22, 32, "IT", "Chandigarh University", 95);
        s3.markAttendence();
        s3.print();
    }   
    
    
}

// Java is almost completely object oriented programming 
