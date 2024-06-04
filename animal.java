public class animal {
    protected String name;
    protected int age;

    public animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("animal sound");
    }

    public void eat() {
        System.out.println("animal is eating");
    }

    public void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            makeSound();
        }
    }

    public void eat(String foodType) {
        System.out.println("animal is eating " + foodType);
    }
}
