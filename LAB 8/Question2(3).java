abstract class Bike{
    int TopSpeed = 100;
    abstract void run();
}

class Honda extends Bike{
    void run() {
        System.out.println(TopSpeed);
    }
}




public class Question2 {
    public static void main(String[] args) {
        Honda obj = new Honda();
        obj.run();
    }
}
