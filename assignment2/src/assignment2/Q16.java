package assignment2;

//how to find prime number program ?

public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 17;
		boolean f = false;
		for(int i = 2; i<=a/2;++i)
		{
			if(a%i == 0) {
			f = true;
			}		
		}
		
		if(!f) {
			System.out.println(a+" Is a prime number");
		}else {
			System.out.println(a+" Is not a prime number");	
		
		
		}
	}
}
