class Learner{
    int RegNo;
    String name;
    String course;

    void display(){
          System.out.println("Registration Number:"+ RegNo);
          System.out.println("Student's Name:"+ name);
          System.out.println("Course:"+ course);
          
    }
    
}

class StartMain{
public static void main(String[] args){
    Learner S1= new Learner();

    S1.RegNo=5184;
    S1.name="David Dray";
    S1.course="Data Science";

    S1.display();
        
    }
}