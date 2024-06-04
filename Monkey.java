public class Monkey extends animal {
    public Monkey(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Chatter");
    }

    @Override
    public void eat() {
        System.out.println("Eating bananas");
    }
}
