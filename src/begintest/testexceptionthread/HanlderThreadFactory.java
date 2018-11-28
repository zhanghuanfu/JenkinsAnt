package begintest.testexceptionthread;

import java.util.concurrent.ThreadFactory;

public class HanlderThreadFactory implements ThreadFactory {

	@Override
	public Thread newThread(Runnable r) {
		System.out.println(this + "creating new Thread");
        Thread t = new Thread(r);
        System.out.println("created " + t);
        t.setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());  //设定线程工厂的异常处理器
        System.out.println("exceptionhandler = " + t.getUncaughtExceptionHandler());
        return t;
	}
}
