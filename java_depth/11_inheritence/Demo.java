public class Demo {
    public static void main(String[] args) {

        EngineeringStudent s1 = new EngineeringStudent("Prashant Kumar", 23, 242);
        s1.markAttendence();
        s1.attendLabs();
    }
}

class Student {
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

class EngineeringStudent extends Student {

    EngineeringStudent(String n, int a, int r) {
        super(n, a, r);
    }

    void attendLabs() {
        System.out.println("Lab Attendece marked by : " + super.name + ", super.age: " + super.age + ", super.rollno: " + rollNum);
    }
}