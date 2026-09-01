public class DragonMain {
    public static void main(String[] args) {
        Dragon dragon1 = new Dragon();
        dragon1.printStatus();
        dragon1.move(5);
        dragon1.changeDirection(2);
        dragon1.move(3);
        dragon1.printStatus();

        Dragon dragon2 = new Dragon(10, 5, 4);
        dragon2.printStatus();
        dragon2.move(4);
        dragon2.changeDirection(3);
        dragon2.move(2);
        dragon2.printStatus();
    }
}