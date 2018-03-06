package thread;

/**
 * Hello world!
 */
public class FirstWay {
    public static void main(String[] args) {
        new FirstTask(1);
        new FirstTask(2);
        System.out.println("Hello World!");
    }
}

class FirstTask extends Thread {
    private int id;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println("TICK "+id);
    }

    public FirstTask(int id) {
        this.id = id;
        this.start();

    }
}
