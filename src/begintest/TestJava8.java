package begintest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class TestJava8 {
	
	public static void main(String[] args) {
		
//		List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
////		features.forEach(n -> System.out.println(n));
//		features.stream().map
//		
//		// ʹ��Java 8�ķ������ø����㣬����������::˫ð�Ų�������ʾ��
//		// ��������C++����������������
//  features.forEach(System.out::println);
		
		
//		double rate = 12.3456789;
//		rate = ((int)(rate * 1000)) / 1000.0;
//		System.out.println(rate);
//		
//		int a = 3;
//		int b = 4;
//		long c = 3;
//		double d = (a + b) / c ;
//		System.out.println(d);
		
		
//		double db = 13.4324;
//		db=((int)(db*100))/100.0; //注意：使用100.0 而不是 100
//		System.out.println(db);
		
//		double rate = (3000 + 980) * 1.0 / 30000;
//		System.out.println(rate);
////		rate = rate * 100;
//		System.out.println(DataFormat.format(rate * 100, 3));
		int is = 1;
		int temp = is + 1;
		int temps = is ++;
		System.out.println(is);
		System.out.println(temp);
		System.out.println(temps);
		
		
		char c = '1';
		char cs = '3';
		int w = c + cs;
		System.out.println(c * cs);
		
		
		float f = 1.8f;
//		double fs = 0.5d;
		System.out.println(f == 1.8);
		
		
		
		System.out.println("" + Float.toHexString(1.8f) + "  " + Double.toHexString(1.8));
		System.out.println("" + Float.toHexString(0.5f) + "  " + Double.toHexString(0.5));
		
		Random r = new Random();
		int tss = r.nextInt(100);
		System.out.println(tss);
		
		int i = -1;
//		System.out.println(Integer.toBinaryString(i>>>10));
		i >>>= 10;
		System.out.println(Integer.toBinaryString((short)i));
		
//		int ii = 1234567890;
//		int iii = 1234567890;
//		System.out.println(ii == iii);
//		Long l = Long.valueOf(-129);
//		Long ls = -129l;
//		System.out.println(l == ls);
//		int i = 1;
//		String s = new String("Hello");
//		HashMap<Integer, String> m = new HashMap<Integer, String>();
//		m.put(0, "Test");
//		PositionStoreTest pos = new PositionStoreTest();
//		pos.mendI(i);
//		System.out.println(s += " World");
//		pos.mendS(s);
//		pos.mendM(m);
//
//		System.out.println(i);
//		System.out.println(s);
//		
//		for (String st : m.values()) {
//			System.out.println(st);
//		}
//		
//		Integer in = -129;
//		Integer ins = -129;
//		System.out.println(in == ins);
//		
//		
//		double amtRate = 0;
//		String limitRate = "0.6";
//		if(110 * 34 != 0) {
//			amtRate = 2600 * 1.0 / (110 * 34);
//		}
//		if(amtRate > Double.valueOf(limitRate)) {
//			System.out.println(Double.valueOf(limitRate));
//			System.out.println(amtRate);
//		}
		
//		System.out.println(2600 / (110 * 34));
	}
	
	private static void mendS(String s) {
		s += "World";
		
	}

	private static void mendI(int a) {
		a = 2;
	}

	public static void isCanDo() {
		
	}
	
	public void isNoCanDo() {
		
	}

}
