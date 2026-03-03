class Student{
    int rollno;
    String name;
    int marks;
}

public class demo{
    public static void main(String a[]){
        
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Sami";
        s1.marks = 99;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Mkt";
        s2.marks = 89;

        Student students[] = new Student[2]; /// array of object
        students[0] = s1;
        students[1] = s2;

        for(int i=0; i<students.length; i++){
            System.out.println(students[i].name + ":" + students[i].marks);
        }
    }
}
