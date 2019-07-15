package calculator;
import java.util.*;


public class Calculator {
	
	private static ArrayList<String> operation = new ArrayList<String>();
	private static String result;
	
	
	public static void performOperation(String value) {
		operation.add(value);
	}
	public static void performOperation(double value) {
		operation.add("" + value);
	}
	public static void getResults() {
		for(int i = 0; i < operation.size(); i++) {
			if(operation.get(i) == "*") {
				double solution = Double.parseDouble(operation.get(i - 1)) * Double.parseDouble(operation.get(i + 1)); 
				operation.set(i - 1, "" + solution);
				operation.remove(i);
				operation.remove(i);
				i--;
			}
			if(operation.get(i) == "/") {
				double solution = Double.parseDouble(operation.get(i - 1)) / Double.parseDouble(operation.get(i + 1)); 
				operation.set(i - 1, "" + solution);
				operation.remove(i);
				operation.remove(i);
				i--;
			}
		}
		for(int i = 0; i < operation.size(); i++) {
			if(operation.get(i) == "+") {
				double solution = Double.parseDouble(operation.get(i - 1)) + Double.parseDouble(operation.get(i + 1)); 
				operation.set(i - 1, "" + solution);
				operation.remove(i);
				operation.remove(i);
				i--;
			}
			if(operation.get(i) == "-") {
				double solution = Double.parseDouble(operation.get(i - 1)) - Double.parseDouble(operation.get(i + 1)); 
				operation.set(i - 1, "" + solution);
				operation.remove(i);
				operation.remove(i);
				i--;
			}
		}
		result = operation.get(0);
		
		System.out.println("The answer is: " + result);
	}
}
