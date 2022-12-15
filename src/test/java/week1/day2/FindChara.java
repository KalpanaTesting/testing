package week1.day2;

public class FindChara {
	
	//String details = "Amazon has 11400 employees in chennai";
	
	// print the numbers only from here!!


	public static void main(String[] args) {
		String company = "hexaware";
		int count =0;
		
	char[] charArray = company.toCharArray();
	
	for (int i = 0; i < charArray.length; i++) {
		
		if(charArray[i]== 'e') {
			count++	;	
		}
			}
	System.out.println("No of e in Company:"+count);

	}

}