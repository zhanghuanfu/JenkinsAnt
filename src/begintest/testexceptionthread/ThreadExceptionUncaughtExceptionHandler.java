package begintest.testexceptionthread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExceptionUncaughtExceptionHandler {

	public static void main(String[] args){
        ExecutorService exec = Executors.newCachedThreadPool(new HanlderThreadFactory());
        exec.execute(new ExceptionThread());
        
        // 在子程序中直接用try，catch捕获子线程异常，但实际应用中无法确定异常具体位置
//		ExecutorService exec = Executors.newCachedThreadPool();
//		exec.execute(new ExceptionThread());
    }
}