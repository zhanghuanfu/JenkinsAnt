package begintest.multithreadtest;

public class Test {

	
	public void synchronizedMethod(){  
		synchronized(Test.class) {
			System.out.println("begin calling sychronizedMethod...");  
			try{
				
				Thread.sleep(5000);  
			}catch(InterruptedException e){  
				e.printStackTrace();  
			}  
			System.out.println("finish calling  sychronizedMethod...");  
		}
    }  
      
  
    public synchronized void generalMethod(){  
    	
    	for(int i = 0; i < 99999999; i ++) {
    		
    	}
    	
    	
        System.out.println("call generalMethod...");  
    }  
	
//	public volatile int inc = 0;
//	 
//    public void increase() {
//        inc++;
//    }
// 
//    public static void main(String[] args) {
//        final Test test = new Test();
//        for(int i=0;i<10;i++){
//            new Thread(){
//                public void run() {
//                    for(int j=0;j<1000;j++)
//                        test.increase();
//                };
//            }.start();
//        }
// 
//        while(Thread.activeCount()>1) { //保证前面的线程都执行完
//            Thread.yield();
//        }
//        
//        System.out.println(test.inc);
//    }
    
    
    
}
