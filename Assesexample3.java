import java.util.*;

class Animal {
  void makeSound() {
    System.out.println("animals are better than human beings");
  }
}

class Dog extends Animal {
  void makeSound() {
    super.makeSound();
    System.out.println("dog barks");
  }
}

public class Assexample3 {
  public static void main(String[] args) {
    Dog d = new Dog();
    d.makeSound();
  }
}
