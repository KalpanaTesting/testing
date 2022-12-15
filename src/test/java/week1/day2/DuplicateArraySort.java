package week1.day2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DuplicateArraySort {
	
	public static void main(String[] args) {
		int dup[] = {2,5,7,7,5,9,2,3};
		
		Arrays.sort(dup);
		System.out.println(dup[1]);
		for (int i = 0; i < dup.length; i++) {
			System.out.print(dup[i]);
		} 
		System.out.println();

		
		for (int j = 0; j < dup.length-1; j++) {
						if(dup[j]==dup[j+1]) {
									System.out.println(dup[j]);
								}
				
			
		}

	}

}
