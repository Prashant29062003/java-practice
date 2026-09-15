// Types of inheritence
// 1. Simple inheritence
// 2. multilevel inheritence
// 3. hierarchical inheritence
// 4. multiple inheritence (not supported in java) --> but can be implemented using interfaces

public class Demo2 {
    public static void main(String[] args) {

    }
}


class Student { // A --> super class
    String name;
    int rollNum;
    int age;

    Student(String s, int a, int r) {
        name = s;
        age = a;
        rollNum = r;
    }

    public void markAttendence() {
        System.out.println("Attendence marked by : " + name + ", age: " + age + ", rollno: " + rollNum);
    }
}

class MedicalStudent extends Student { // B --> sub class
    MedicalStudent(String n, int a, int r) {
        super(n, a, r);
    }

    void attendLabs(){
        System.out.println("Lab Attendece for medical student marked by : " + name + ", age: " + age + ", rollno: " + rollNum);
    }
}

class EngineeringStudent extends Student {  // C --> sub class

    EngineeringStudent(String n, int a, int r) {
        super(n, a, r);
    }

    void attendLabs() {
        System.out.println("Lab Attendece for engineering student marked by : " + name + ", age: " + age + ", rollno: " + rollNum);
    }
}

class ECEStudent extends EngineeringStudent {
    ECEStudent(String n, int a, int r) {
        super(n, a, r);
    }

}

// multi-level inheritence
// Student
// |
// EngineeringStudent
// |
// ECEStudent


// hierarchical inheritence
//      A
//     / \
//    B   C

/*
multple inheritence
    A  B
    \ /
     C
*/

// Why multiple inheritence is not supported in java
// due to diamond problem


// NOTE:
// super --> refernce of parent object
// this --> refernce of current object

// uses of super
// 1. 