package begintest;

public class TestFinal {

	public static void main(String[] args) {
		
		
		System.out.println(args[0]);
//		String a = "hello2";
//		String b = "hello";
//		String c = b + 2;
//		System.out.println(c);
//		System.out.println(a == c);
//		System.out.println(a.equals(c));
		
//		###########################################
		
//		MyClass myClass1 = new MyClass();
//        MyClass myClass2 = new MyClass();
//        System.out.println(myClass1.i);
//        System.out.println(MyClass.j);
//        System.out.println(myClass2.i);
//        System.out.println(MyClass.j);
        
//        ########################################
        
//		 	MyClass myClass = new MyClass();
//	        int i = 0;
//	        myClass.setI(i);
//	        i++;
//	        System.out.println(i);
//	        System.out.println("测试3：" + i++);
//	        myClass.outI();
//	        
//	        ####################################
	        
	        MyClass myClass = new MyClass();
	        StringBuffer buffer = new StringBuffer("hello");
	        myClass.changeValue(buffer);
	        System.out.println(buffer.toString());
		
	}
}

class MyClass {
//    public final double i = Math.random();
//    public static double j = Math.random();
	
//	##########################
	
//	private int i = 0;
//	 
//    public void setI(int i) {
////        this.i = i;
//    	this.i = i++;
//    	System.out.println("测试：" + i);
//    	System.out.println("测试2：" + this.i);
//    }
// 
//    public void outI() {
//        System.out.println(this.i);
//    }
	
	
//	########################################
	
	void changeValue(StringBuffer buffer) {
//        buffer.append("world");
		buffer = new StringBuffer("test");
        System.out.println("测试：" + buffer);
    }
}
