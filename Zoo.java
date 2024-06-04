public class Zoo {
    public static void main(String[] args) {
        animal lion = new Lion("Leo", 5);
        animal elephant = new Elephant("Ella", 10);
        animal monkey = new Monkey("Momo", 3);

        lion.makeSound();
        lion.eat();
        lion.makeSound(3); // Demonstrating overloaded method
        lion.eat("fish");  // Demonstrating overloaded method

        elephant.makeSound();
        elephant.eat();
        elephant.makeSound(2); // Demonstrating overloaded method
        elephant.eat("leaves");  // Demonstrating overloaded method

        monkey.makeSound();
        monkey.eat();
        monkey.makeSound(4); // Demonstrating overloaded method
        monkey.eat("fruits");  // Demonstrating overloaded method
    }
}
