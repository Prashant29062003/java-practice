public class Demo {
    public static void main(String[] args) {
        // Static keyword in java
        // 1. One static method can only call other sataic method
        // 2. static method can only access static variable
        // 3. doesn't have access to 'this' keyword

        Student s1 = new Student("Prashant", 23, 102, "ECE", 100);
        Student s2 = new Student("Adarsh", 23, 103, "ECE", 100);

        Student.college = "IIT Madras";
        
        s1.print();
        s2.print();
    }
}

class Student {
    String name;
    int age;
    int rollno;
    String stream;
    static String college;
    int marks;

    Student(String n, int a, int r, String s, int m) { // parameterized constructor --> constructor overloading
        this.name = n;
        this.age = a;
        this.rollno = r;
        this.stream = s;
        this.marks = m;
    }

    void print() {
        System.out.println("name: " + name + ", age: " + age + ", rollno: " + rollno + ", stream: " + stream + ", college: " + college +  ", marks: " + marks);
    }
}