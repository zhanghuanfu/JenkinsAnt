package begintest.callabletest;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExceptionTest {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(8);
		Future<String> future = executorService.submit(new CallableChild());
		
		try {
			String d = future.get();
			System.out.println("future get :" + d);
		} catch (InterruptedException e) {
			System.out.println(String.format("handle InterruptedException in child thread. %s", e));
		} catch (ExecutionException e) {
			System.out.println(String.format("handle ExecutionException in child thread. %s", e));
		} finally {
			if (executorService != null) {
				executorService.shutdown();
			}
		}
	}
}