package chapter15;

import java.util.List;
import java.util.Map;

import net.mindview.util.New;

public class LimitsOfInference {

	static void f(Map<String, List<String>> map) {
		
	}
	
	public static void main(String[] args) {
		//f(New.map()); //does not compile
	}
}
