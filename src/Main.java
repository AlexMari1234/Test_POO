// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


class Engine {
    private int pistons;
    private String shape;

    private int age;

    public Engine() {

    }


    public Engine(int pistons, String shape) {
        this.pistons = pistons;
        this.shape = shape;
    }

    public void turnEngineOn() {
        System.out.println("Engine started.");
    }

    public void turnEngineOff() {
        System.out.println("Engine shut down.");
    }
}


public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(5, "ana");
        engine.turnEngineOff();
    }
}