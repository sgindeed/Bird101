public class Pigeon extends Bird101 implements Flyable {
    public void fly() {
        System.out.println("Pigeon can fly");

    }

    public void makeSound() {
        System.out.println("Pigeon makes sound");
    }

    public static void main(String[] args) {
        Pigeon p = new Pigeon();
        p.fly();
        p.makeSound();
    }
}
