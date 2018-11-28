package begintest.multithreadtest;

public class MultiThread {

	 static Test t = new Test();  
    public static void main(String[] args) {  
//            Thread t1=new Thread(){  
//                public void run(){  
//                    t.synchronizedMethod();  
//                }   
//            };  
              
            Thread t2=new Thread(){ 
            	
                public void run(){ 
                	
                    t.generalMethod(); 
                    System.out.println(this.isInterrupted());
                    Thread.interrupted();
                    System.out.println(this.isInterrupted());
                    Thread.interrupted();
                    System.out.println(this.isInterrupted());
//                    System.out.println(t2.isInterrupted());
//                    Thread.interrupted();
//                    System.out.println(t2.isInterrupted());
//                    Thread.interrupted();
//                    System.out.println(t2.isInterrupted());
                }  
            };  
  
//            t1.start();  
            t2.start();  
            System.out.println(t2.isInterrupted());
            t2.interrupt();
            System.out.println(t2.isInterrupted());
  
    }  
}
