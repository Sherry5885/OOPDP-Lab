abstract class Phone {
    abstract void call();
    abstract void sms();
}

interface Camera {
    void click();
    void record();
}

interface MusicPlayer {
    void play();
    void pause();
    void stop();
}

class SmartPhone extends Phone implements Camera, MusicPlayer {
    void call() {
        System.out.println("Calling");
    }
    void sms() {
        System.out.println("Sending SMS");
    }
    public void click() {
        System.out.println("Clicking a photo");
    }
    public void record() {
        System.out.println("Recording video");
    }
    public void play() {
        System.out.println("Playing music");
    }
    public void pause() {
        System.out.println("Pausing music");
    }
    public void stop() {
        System.out.println("Stopping music");
    }
}

public class Question6 {
    public static void main(String[] args) {
        SmartPhone obj = new SmartPhone();
        Phone obj1 = obj;
        Camera obj2 = obj;
        MusicPlayer obj3 = obj;
        obj1.call();
        obj1.sms();

        obj2.click();
        obj2.record();

        obj3.play();
        obj3.pause();
        obj3.stop();
    }
}
