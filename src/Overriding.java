public class Overriding {
    public static void main(String[] args) {
        Animal_Overriding a = new Animal_Overriding();   // Animal reference and object
        Animal_Overriding b = new Dog_Overriding();   // Animal reference but Dog object

        a.move();   // runs the method in Animal class
        b.move();   // runs the method in Dog class
    }
}


class Animal_Overriding {
    public void move() {
        System.out.println("Animals can move");
    }
}

class Dog_Overriding extends Animal_Overriding {
    public void move() {
        System.out.println("Dogs can walk and run");
    }
}