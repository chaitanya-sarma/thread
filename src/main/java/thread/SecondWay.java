package thread;

/**
 * Hello world!
 */
public class SecondWay {
    public static void main(String[] args) {
        new SecondTask(1).start();
        Thread secondTask1 = new SecondTask(2);
        secondTask1.start();
        System.out.println("Hello World!");
    }
}

class SecondTask extends Thread {
    private int id;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println("TICK "+id);
    }

    public SecondTask(int id) {
        this.id = id;
    }
}
