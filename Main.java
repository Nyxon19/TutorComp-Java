class Animal {
    void makeSound(){
        System.out.println("Animals make sound");
    }
}
class Cat extends Animal{
/*  void makeSound(){
        System.out.println("Meow!");
    }*/
}
class Main{
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Cat c1 = new Cat();

        a1.makeSound();
        c1.makeSound();
    }
}