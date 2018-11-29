package beforetest;

import java.util.Random;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

public class TestQueue {  
    public static void main(String[] args) throws InterruptedException {  
        SynchronousQueue<Integer> queue = new SynchronousQueue<Integer>();  
      
        new Product(queue).start();  
        new Customer(queue).start();  
    }  
    static class Product extends Thread{  
        SynchronousQueue<Integer> queue;  
        public Product(SynchronousQueue<Integer> queue){  
            this.queue = queue;  
        }  
        @Override  
        public void run(){  
            while(true){  
                int rand = new Random().nextInt(1000);  
                System.out.println(""+rand);  
                System.out.println("");  
//                try {  
//                    TimeUnit.SECONDS.sleep(3);  
//                } catch (InterruptedException e) {  
//                    e.printStackTrace();  
//                }  
                try {  
                    queue.put(rand);
                    System.out.println("" + rand);
                    System.out.println(queue.isEmpty());
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {  
                    e.printStackTrace();  
                }  
                  
//                System.out.println(queue.isEmpty());  
            }  
        }  
    }  
    static class Customer extends Thread{  
        SynchronousQueue<Integer> queue;  
        public Customer(SynchronousQueue<Integer> queue){  
            this.queue = queue;  
        }  
        @Override  
        public void run(){  
            while(true){  
                try {  
                    System.out.println(""+queue.take());  
                } catch (InterruptedException e) {  
                    e.printStackTrace();  
                }  
                System.out.println("------------------------------------------");  
            }  
        }  
    }  
  
}
