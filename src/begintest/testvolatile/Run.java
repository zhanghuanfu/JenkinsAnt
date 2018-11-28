package begintest.testvolatile;

public class Run {
    public static void main(String[] args) {
        try {
            RunThread thread = new RunThread();
            thread.start();
            Thread.sleep(1000);
            
            thread.setRunning(false);
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
