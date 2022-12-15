package homework.week1;

import java.util.Iterator;

public class LengthLastWord {
	public static void main(String[] args) {
		String s="Hello11 World@###";
		int len=0;
		String[] split = s.split(" ");
		//char[] charArray = s.toCharArray();
		int length =split[split.length-1].length() ;  
		System.out.println(length);
	
		String s2=" fly me to the moon ";
		String trim = s2.trim();
		String[] split2 = trim.split(" ");
		int length2 = split2[split2.length-1].length();
		System.out.println(length2);
		for(int i=0; i<split2.length; i++) {
			System.out.println(split2[i]);
		}
		
		String s3="luffy is still joyboy";
		String[] split3 = s3.split(" ");
		int length3 = split3[split3.length-1].length();
		System.out.println("3rd string lenght  " +length3);
		
	}

}
