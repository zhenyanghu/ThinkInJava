package chapter15;

import static net.mindview.util.BasicGenerator.*;//直接导入BasicGenerator中的静态方法
import net.mindview.util.Generator;

public class BasicGeneratorDemo {

	public static void main(String[] args) {
		 Generator<CountedObject> co = create(CountedObject.class);
//		Generator<CountedObject> co = new BasicGenerator<CountedObject>(CountedObject.class);
		 System.out.println(co.next());
		 for (int i = 0; i < 5; i++) {
			 System.out.println(co.next());
		}
	}
}
