package othertest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>() {;
			{
				add(1);
				add(2);
				add(3);
				add(4);
			}
		};
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			Integer integer = it.next();
			
		}
		
	}
}
