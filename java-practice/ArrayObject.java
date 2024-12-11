class Student {
    String name;
    int rollno;
    int marks;
}
public class ArrayObject {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Prashant Kumar";
        s1.rollno = 242;
        s1.marks = 100;

        Student s2 = new Student();
        s2.name = "Adarsh Kumar";
        s2.rollno = 280;
        s2.marks = 98;

        Student s3 = new Student();
        s3.name = "Prashant Sharma";
        s3.rollno = 290;
        s3.marks = 89;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i= 0;i<students.length;i++){
            System.out.println(students[i].name + ": " + students[i].marks);
        }
        
        // by using for each loop (we called as enhance for loop)
        System.out.println("using for each loop: ");
        for (Student stud : students) {
            System.out.println(stud.name + ": " + stud.rollno);
            
        }
    }
}
