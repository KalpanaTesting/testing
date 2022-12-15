package week2.day2;

public class FindLargestNumberArray {


	// Driver method
	public static void main(String[] args)
	{
		int[] a= {10,20,30,50,40,2,4,10};
int temp;
for(int i=0; i<a.length; i++) {
	for(int j=i+1; j<a.length;j++){
		if(a[i]>a[j]) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
}System.out.println(a[a.length-2]);
	
	
	String sen="Hello baby";
	String rev="";
	String[] splitedSen=sen.split(" ");
	
	for(int i=splitedSen.length-1; i>=0; i--) {
		rev=rev+splitedSen[i]+" ";
	}System.out.println(rev);
	
	String word="Hello";
	String rev1="";
	//char[] chara=word.toCharArray();
	//System.out.println(chara.length);
	for(int i=word.length()-1;i>=0;i--) {
		rev1=rev1+word.charAt(i);
	}
	System.out.println(rev1);
	
	int[] maj= {3,2,2,4,5};
	int index=0;
	int count=0;
	for(int i=0;i<maj.length-1;i++) {
		for(int j=i+1;j<maj.length-1;j++) {
			if(maj[i]==maj[j]) {
				count++;
			}
		}
	if(count>0) {
		index=i;
	}
	}
	System.out.println(maj[index]);

	}
}
