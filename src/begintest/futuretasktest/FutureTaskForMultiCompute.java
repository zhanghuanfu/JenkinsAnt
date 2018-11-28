package begintest.futuretasktest;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class FutureTaskForMultiCompute {  
    
    public static void main(String[] args) {  
          
        FutureTaskForMultiCompute inst=new FutureTaskForMultiCompute();  
        // 创建任务集合  
        List<Future<Integer>> taskList = new ArrayList<Future<Integer>>();  
        // 创建线程池  
        ExecutorService exec = Executors.newFixedThreadPool(5);  
        for (int i = 0; i < 10; i++) { 
        	
            //传入Callable对象创建FutureTask注意这里的ft实现了callable接口  
            FutureTask<Integer> ft = new FutureTask<Integer>(new ComputeTask(i, ""+i));
        	
            //第二种提交方式为 
//            Future<Integer>ft=exec.submit(new ComputeTask(i,""+i));
            
            taskList.add(ft);  
            //提交给线程池执行任务，也可以通过exec.invokeAll(taskList)一次性提交所有任务;  
            exec.submit(ft);  
        }  
          
        System.out.println("所有计算任务提交完毕, 主线程接着干其他事情！");  
  
        // 开始统计各计算线程计算结果  
        Integer totalResult = 0;  
        for (Future<Integer> ft : taskList) {  
            try {  
                //FutureTask的get方法会自动阻塞,直到获取计算结果为止  
                totalResult = totalResult + ft.get();  
            } catch (InterruptedException e) {  
                e.printStackTrace();  
            } catch (ExecutionException e) {  
                e.printStackTrace();  
            }  
        }  
  
        // 关闭线程池  
        exec.shutdown();  
        System.out.println("多任务计算后的总结果是:" + totalResult);  
  
    }  
  
      
}
