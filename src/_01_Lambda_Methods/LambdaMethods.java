package _01_Lambda_Methods;

import java.util.ArrayList;
import java.util.Random;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		
		printCustomMessage((s)->{
			ArrayList<String> reverse = new ArrayList<String>();
			String rWord = "";
			for(int i = 0; i < s.length(); i++) {
				reverse.add(s.charAt(i) + "");
			}
			for(int a = 0; a < reverse.size(); a++) {
				rWord = rWord + reverse.get(reverse.size() - a - 1);
			}
			System.out.println(rWord);
		}, "reverse");
		
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		
		printCustomMessage((s)->{
			Random r = new Random();
			ArrayList<String> characters = new ArrayList<String>();
			String finalWord = "";
				for(int a = 0; a < s.length(); a++) {
					characters.add(s.charAt(a) + "");
					int chance = r.nextInt(2);
					if(chance == 0) {
						characters.get(a).toUpperCase();
					}
					finalWord = finalWord + characters.get(a);
				}
				System.out.println(finalWord);
		}, "test");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
	
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
