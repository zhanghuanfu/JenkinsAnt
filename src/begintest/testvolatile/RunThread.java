package begintest.testvolatile;

public class RunThread extends Thread {

    private boolean isRunning = true;

    int i = 0;
    
    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean isRunning) {
    	System.out.println("set 执行前");
    	this.isRunning = isRunning;
    	System.out.println("set isRunning 时 i值为：" + i);
//    	try {
//			Thread.sleep(1000 * 10);
//			System.out.println(Thread.currentThread().getName());
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
    }

    @Override
    public void run() {
        System.out.println("进入到run方法中了");
        while (isRunning) {
        	
//        	if(i == 10) {
//        		try {
//					RunThread.sleep(10);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//        	}
        	
        	System.out.println(i);
        	try {
				RunThread.sleep((long) 0.5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        	System.out.println("i ++ 执行前");
        	i ++;
        	System.out.println("i ++ 执行了 后 ：" + i);
        }
        System.out.println("线程执行完成了");
    }
}
