public class CopyConstructor 
{

public static void main(String[]args)
{
    Student s1=new Student();
      
}

}

class Student{
    String name;
    int roll;

Student() // non-parametrised constructor
    {
        System.out.println("constructor is called");
    }

    Student(String name)
    {
        this.name=name;
    }
    Student(int roll)
    {
        this.roll=roll;
    }
}
