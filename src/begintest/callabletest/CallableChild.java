package begintest.callabletest;

import java.util.concurrent.Callable;

public class CallableChild implements Callable<String> {

	@Override
	public String call() throws Exception {
		System.out.println("do something 1");
        exceptionMethod();
        System.out.println("do something 2");
        return "test result";
    }

    private void exceptionMethod() {
        throw new RuntimeException("ChildThread1 exception");
    }

}
