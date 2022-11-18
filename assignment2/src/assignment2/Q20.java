package assignment2;

//write an algorithm to implement bubble sort


public class Q20 {

	void bubble(int arr[]) {
		int n = arr.length;
		for(int i = 0; i <n - 1;i++) {
			for(int j = 0;j<n - 1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}
			}
		}
	}
	
	void array(int arr []) {
		int n = arr.length;
		for(int i = 0; i<n; ++i) {
			System.out.print(arr[i]+" ");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Q20 q20 = new Q20();
		int arr[] = {17,2,1,4,18,23,5,12,4};
		q20.bubble(arr);
		System.out.println("Sorted array");
		q20.array(arr);
		
	}

}
