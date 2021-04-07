package Worker;

public class Worker extends Thread {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        int successTask = 0;
        int errorTask = 0;
        for (int i = 1; i < 101; i++) {
            if (i == 33) {
                errorCallback.onError("Задача " + i  +" - ошибка выполнения!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                errorTask ++;
                continue;
            }
            callback.onDone("Задача " + i + " успешно выполнена.");
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            successTask ++;
        }
        System.out.println("Успешно выполнено " + successTask + " задачи. Ошибок выполнения: " + errorTask );
    }
}