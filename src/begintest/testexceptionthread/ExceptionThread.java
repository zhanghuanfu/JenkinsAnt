package begintest.testexceptionthread;

public class ExceptionThread implements Runnable {

	/*
	 * 显式抛出一个异常
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		Thread t = Thread.currentThread();
        System.out.println("run() by " + t);
        
        //子线程中如确定抛出异常位置也可以try，catch捕获
//        try {
//        	throw new RuntimeException();
//        	
//        } catch(RuntimeException e) {
//                System.out.println("Exception has been handled!");
//        }
        
        System.out.println("eh = " + t.getUncaughtExceptionHandler());
        throw new RuntimeException();
	}
}
