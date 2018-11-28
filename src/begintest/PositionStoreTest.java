package begintest;

import java.util.HashMap;

public class PositionStoreTest {

	int a = 1;
	
	public void mendI(int i) {
		i = 2;
	}
	public void mendS(String s) {
		s += " World";
	}
	
	public void mendM(HashMap<Integer, String> m) {
		HashMap<Integer, String> ms = m;
		ms.put(1, "AfterMend");
	}
	
}
