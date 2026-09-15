public class Demo3 {
    public static void main(String[] args ){
        Engineering s1 = new Engineering("Prashant Kumar", 23, 242, "IIT Madras");
        s1.print();
    }
}

class Student {
    String name;
    int rollNum;
    int age;

    Student() {}

    Student (String n, int a, int r) {
        name = n;
        age = a;
        rollNum = r;
    }

    void print(){
        System.out.println("name: " + name + ", age: " + age + ", rollno: " + rollNum);
    }
}

class Engineering extends Student {
    String college;

    Engineering() {}

    Engineering(String n, int a, int r, String c) {
        super(n, a, r);
        this.college = c;
    }

    void print(){
        super.print();
        System.out.println("I am an engineering student of college: " + college);
    }
}