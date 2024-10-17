public class AbstractExample {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        h.ChangeColor(); // Change the color of the Horse
        System.out.println(h.color); // Now it will print "darkbrown"
        
        Chicken c = new Chicken();
        c.eat();
        c.walk();
        c.ChangeColor(); // Change the color of the Chicken
        System.out.println(c.color); // Now it will print "white"
    }
}

abstract class Animal {
    String color;
    
    Animal() {
        color = "brown";
    }

    void eat() {
        System.out.println("Eat");
    }

    abstract void walk();
}

class Horse extends Animal {
    void ChangeColor() {
        color = "darkbrown"; // Change color for Horse
    }

    void eat() {
        System.out.println("Eating grass");
    }

    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal {
    void ChangeColor() {
        color = "white"; // Change color for Chicken
    }

    void eat() {
        System.out.println("Eating ...");
    }

    void walk() {
        System.out.println("walks on 2 legs");
    }
}
