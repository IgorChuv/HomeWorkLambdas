package Worker;

public class Worker extends Thread {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        int succesTask = 0;
        int errorTask = 0;
        for (int i = 1; i < 101; i++) {
            if (i == 33) {
                errorCallback.onError("������ " + i  +" - ������ ����������!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                errorTask ++;
                continue;
            }
            callback.onDone("������ " + i + " ���������.");
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            succesTask ++;
        }
        System.out.println("������� ���������: " + succesTask + " �����. ������ ����������: " + errorTask );
    }
}