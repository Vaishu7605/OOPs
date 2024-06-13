
abstract class Computer {

    public abstract void code();
    // {
    // System.out.println("coding");
    // }
}

class Desktop extends Computer {

    public void code() {
        System.out.println("coding...");
    }
}

class Laptop extends Computer {

    public void code() {
        System.out.println("coding at ease...");
    }
}

class dev {

    public void appD(Computer com) {
        com.code();
    }
}

public class inte {

    public static void main(String[] args) {
        // Computer c = new Computer();
        // c.code();
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        desk.
    
    }
}
