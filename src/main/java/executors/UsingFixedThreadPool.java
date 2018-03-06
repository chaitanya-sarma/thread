package executors;

import Util.TaskA;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingFixedThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(new TaskA(1));
        executorService.submit(new TaskA(2));
        executorService.submit(new TaskA(3));
        executorService.submit(new TaskA(4));
        executorService.submit(new TaskA(5));
        executorService.submit(new TaskA(6));
        executorService.shutdown();
    }
}
