package thread.sleep;

import java.util.Arrays;
import java.util.List;

public class SleepDemo {
	static String[] s = new String[] {"summer","winter","spring"};

	public static void main(String[] args) {
		List<String> seasonList = Arrays.asList(s);
		
				
				for(String value:seasonList) {
					//pause for 4 seconds
					try {
						Thread.sleep(4000);
					}catch(InterruptedException exp) {
						System.out.println(exp.getMessage());
					}
					System.out.println(value);
					
				}

	 }

}
