package chapter09.exercise11;

public class Apply {

	public static void process(Processor p, Object s) {
		System.out.println("Using Processor" + p.name());
		System.out.println(p.process(s));
	}
}
