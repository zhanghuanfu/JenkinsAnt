package beforetest;

public class JenkinsMain {

	public static void main(String[] args) {

		System.out.println("Zhanghf Jenkins Setup !");
		
		TestForMain t = new TestForMain();
		
		TestForMain l = exchange(t);
		
		System.out.println("******");
		System.out.println(l);
		System.out.println("******");
	}
	
	public static TestForMain exchange(Object o) {
		return (TestForMain)o;
	}

}
