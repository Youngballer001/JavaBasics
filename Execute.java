class Student {
    int RegNo;
    String name;
    String course;


    void Display(){
        System.out.println("Registration Number:" + RegNo);
        System.out.println("Name:" + name);
        System.out.println("Course:" + course);

    }
    
}
public class Execute{
    public static void main(String[] args){
    Student s1= new Student();

    s1.RegNo=32278;
    s1.name="Denis Mugo";
    s1.course="Computer Science";

    s1.Display();
    }
}