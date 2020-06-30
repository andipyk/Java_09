public class Invoking_Superclass_Constructor {
    public static void main(String argd[]) {
        Subclass3 s = new Subclass3(24);
        s.getAge();
    }
}

class Super_class3 {
    int age;

    Super_class3(int age) {
        this.age = age;
    }

    public void getAge() {
        System.out.println("The value of the variable named age in super class is: " +age);
    }
}

class Subclass3 extends Super_class3 {
    Subclass3(int age) {
        super(age);
    }

}

//Output : The value of the variable named age in super class is: 24
