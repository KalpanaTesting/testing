package week1.day2;

public class DuplicateNum {
	
	public static void main(String[] args) {
		int dup[] = {2,5,7,7,5,9,2,3};
		
		for (int i = 0; i < dup.length; i++) {
			for (int j = i+1; j < dup.length; j++) {
				//System.out.println(dup[i]);
				//System.out.println(dup[j]);
				if(dup[i] == dup[j]) {
					System.out.println(dup[i]);
				}
				
			}
			
		}
	}

}
