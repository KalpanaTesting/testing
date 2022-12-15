package week1.day2;

import java.util.Iterator;

public class WordsCount {
	public static void main(String[] args) {
		String name ="Amazon Development centre, Chennai";
		
		String lowerCase = name.toLowerCase();
		String[] split = lowerCase.split(" ");
		System.out.println(split.length);
		
		for (int i = split.length-1; i >=0; i--) {
			System.out.print(split[i] + " ");
			
		}
	}

}
