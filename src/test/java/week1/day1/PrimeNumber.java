package week1.day1;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int n=7;
		boolean bPrime = true;
		
		for(int i=1; i<n ;i++) {
			
			if(n%i==0) {
				System.out.println("Not a Prime no");
				bPrime =false;
				break;
			}
		}
		
		if(bPrime== true) {
			System.out.println("Prime No");
		}
	}

}
