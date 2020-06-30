package inheritance;

public class IS_A_Relationship {
    public static void main(String args[]) {
        Animal a = new Animal();
        Mammal m = new Mammal();
        Dog d = new Dog();

        System.out.println(m instanceof Animal); // menguji keturunan instance of
        System.out.println(d instanceof Mammal);
        System.out.println(d instanceof Animal);
    }
}


class Animal {
}

class Mammal extends Animal {
}

class Reptile extends Animal {
}

class Dog extends Mammal {

}