package begintest.mulaltitude;

public class Main {

	public static void main(String[] args) {
		A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();
//        System.out.println(a1.show(b)); // 1:a  a
//        System.out.println(a1.show(c)); //2:a a
//        System.out.println(a1.show(d)); //3:a d
//        System.out.println(a2.show(b)); //4:b a
//        System.out.println(a2.show(c)); //5:b a
//        System.out.println(a2.show(d)); //6:a d、
//        System.out.println(b.show(b));//7:b b
//        System.out.println(b.show(c)); //8:b b
//        System.out.println(b.show(d)); //9:a d
        
        System.out.println("###########################################");
        
        System.out.println(a2.show(b));
	}
}
