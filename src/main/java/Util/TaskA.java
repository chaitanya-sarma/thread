package Util;

public class TaskA implements Runnable {
    private int id;

    public void run() {

        System.out.println("Task Start " + id);
        for (int i = 0; i < 10; i++)
            System.out.println("TICK " + id);
        System.out.println("Task End " + id);

    }

    public TaskA(int id) {
        this.id = id;
    }
}
