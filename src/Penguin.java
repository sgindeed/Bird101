public class Penguin extends Bird101{
    public void makeSound() {
        System.out.println("Penguin makes sound");
    }
    public static void main(String[]args){
        Penguin pg = new Penguin();
        pg.makeSound();
    }
}
