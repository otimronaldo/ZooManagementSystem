public class Elephant extends animal {
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Trumpet");
    }

    @Override
    public void eat() {
        System.out.println("Eating grass");
    }
}
