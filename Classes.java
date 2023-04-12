public class Classes{
    public static void main(String[] args) {
        Student saurav = new Student();
        saurav.roll_no=1;
        saurav.name="Saurav Sharma";
        saurav.marks=99.0f;
        System.out.println(saurav.roll_no);
        System.out.println(saurav.name);
        System.out.println(saurav.marks);
        saurav.greeting();
        final int a =5;
        System.out.println(a);        
    }
}
class Student{
    int roll_no;
    float marks;
    String name;
    Student(Student xd){
        this.roll_no = xd.roll_no;
        this.marks=xd.marks;
        this.name=xd.name;
    }
    Student(){
        System.out.println("Object created");
   } 
    Student(int roll_no,String name,float marks){
        this.roll_no = roll_no;
        this.name = name;
        this.marks = marks;
    }
    void greeting(){
        System.out.println("Hemlo Keemds" + " " + this.name);
    }
}