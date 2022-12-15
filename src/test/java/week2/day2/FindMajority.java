package week2.day2;

public class FindMajority {
	public void findMajority(int arr[], int n)
    {
        int maxCount = 0;
        int index = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }
        System.out.println("Majority Value is " +arr[index] + " and appeared " +index +" times");
    }
	
	public static void main(String[] args) {
		int[] arr = {2,2,1,1,1,2,2,10,10,10,10,10,10,10,5,5,5,5,5,5,5,5};
		int n = arr.length;
		 System.out.println("Array Length:"+n);
		 FindMajority mElements = new FindMajority();
        
		 mElements.findMajority(arr, n);
	}



}
