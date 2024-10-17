public class Inheritance 
{
public static void main(String[]args)
{
    // Fish shark=new Fish();
    // shark.eat();
    // Dog doggy=new Dog();
    // doggy.eat();
    // doggy.legs=4;
    // System.out.println(doggy.legs);
    

}  
}
class Animal
{
    String color;
    void eat()
    {
        System.out.println("Eating...");
    }
    void breadthe()
    {
        System.out.println("breadths");
    }
}
//Derived class
// class Fish extends Animal
// {

//     int fins;

//     void swim()
//     {
//         System.out.println("Swims in water");
//     }
// }  
class Mammal extends Animal
{
   void Walk()
   {
    System.out.println("Walking...");
   }

}
class Fish extends Animal
{
    void swim()
    {
        System.out.println("Swim");
    }
}
class Bird extends Animal
{
    void fly()
    {
        System.out.println("flying");
    }
}


