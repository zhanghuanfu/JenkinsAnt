package begintest.testexceptionthread;

import java.lang.Thread.UncaughtExceptionHandler;

public class MyUncaughtExceptionHandler implements UncaughtExceptionHandler{
	
	/*
     * Thread.UncaughtExceptionHandler.uncaughtException()会在线程因未捕获的异常而临近死亡时被调用
     */
	
	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("caught###" + e);
	}
}
