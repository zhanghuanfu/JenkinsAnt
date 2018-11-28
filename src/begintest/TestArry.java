package begintest;

public class TestArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		byte[] a = new byte[10];
//		for(int i = 0; i < 10; i ++) {
//			a[i] = (byte)(i + 1);
//			System.out.println(a[i]);
//		}
//			
//		String b = new String(a);
//		System.out.println(b);
//		String c = b.substring(1, 2);
//		System.out.println(c);
		
		
		 //Original String
        String string = "hello world";
         
        //Convert to byte[]
        byte[] bytes = string.getBytes();
         
        //Convert back to String
        String s = new String(bytes);
        System.out.println(s);
	}

}
