package assignment2;

//how to reverse an int array ??

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] a = {3,6,7,4,8};
		
		System.out.println("Before reverse : ");
		for(int i=0;i<a.length;i++)
	         System.out.print(a[i] + "  ");
		System.out.println();
		
		System.out.println("After reverse : ");
		for(int i = a.length-1;i>=0;i--) {
			System.out.print(a[i] + "  ");
		}
		
	}

}
