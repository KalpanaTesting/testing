package homework.week1;

public class NonNegativeInt {
	public int add(int  num) {
		int t;
		int sqrt=num/2;
		do {
			 t=sqrt;
			sqrt=(t+(num/t))/2;
		
		}while ((t-sqrt)!=0);
		return sqrt;
	}
	public static void main(String[] args) {
		NonNegativeInt non=new NonNegativeInt();
		System.out.println(non.add(8));
		int n=7;
		for(int i=2;i<=n;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
		int count=0;
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count>0) {
			System.out.println("prime number");
		}else {
			System.out.println("not a prime number" +n);
		}
		
		
	}

}
