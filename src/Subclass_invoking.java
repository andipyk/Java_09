class Super_class2 {
    int age;

    Super_class2(int age) {
        this.age = age;
    }

    public void getAge() {
        System.out.println("The value of the variable named age in super class is: " +age);
    }
}

public class Subclass_invoking extends Super_class2 {
    Subclass_invoking(int age) {
        super(age);
    }

    public static void main(String argd[]) {
        Subclass_invoking s = new Subclass_invoking(24);
        s.getAge();
    }
}