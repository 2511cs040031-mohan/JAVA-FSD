class Animal {

    // Parent class method
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    // Overriding the parent class method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class OverridingDemo {

    public static void main(String[] args) {

        // Parent class reference, child class object
        Animal a = new Dog();

        // Calls the overridden method in Dog class
        a.sound();
    }
}