class Engine {
    private int pistons;
    private String shape;

    private int age;

    public Engine() {
        System.out.println("ana aare mmrw");
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