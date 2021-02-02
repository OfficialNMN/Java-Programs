import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Map m = new HashMap();
		
		String sentence = "Hello I am NMN and I suck in Programming hehehe";
		for(char x : sentence.toLowerCase().toCharArray()) {
			if (m.containsKey(x)) {
				int old=(int) m.get(x);
				m.put(x, old+1);
			}
			else {
				m.put(x, 1);
			}
		}
		m.remove(' ');
		System.out.println(m);

		
	}

}
