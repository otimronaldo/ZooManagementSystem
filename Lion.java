public class Lion extends animal {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Roar");
    }

    @Override
    public void eat() {
        System.out.println("Eating meat");
    }
}