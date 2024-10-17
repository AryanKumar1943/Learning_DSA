public class ConstrutorExample 
{

public static void main(String[]args)
{
    Student s1=new Student();
    s1.name="aryan";
    s1.roll=456;
    s1.password="abcd";
    s1.marks[0]=100;
    s1.marks[1]=90;
    s1.marks[2]=10;
    Student s2=new Student(s1);
    s2.password="xyz";
    s1.marks[2]=70;
    for(int i=0;i<3;i++)
    {
        System.out.println(s2.marks[i]); // 100 90 70 shallow copy
    }
}
}
class Student{
    String name;
    int roll;
    String password;
    int marks[];
    //Shallow copy Construct
    class Address
    {
        String city;
    }
    //shallow copy constructor 
    // Student(Student s1)
    // {
    //     marks=new int[3];
    //     this.name=s1.name;
    //     this.roll=s1.roll;
    //     this.marks=s1.marks;
    // }
    
    //deep copy constructor
    Student(Student s1)
    {
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        for(int i=0;i<marks.length;i++)
        {
    this.marks[i]=s1.marks[i];
        }
    }

Student() // non-parametrised constructor
    {
        marks=new int[3];
        System.out.println("constructor is called");
    }
}
