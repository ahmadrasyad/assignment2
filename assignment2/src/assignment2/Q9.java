package assignment2;

//write a java program to check whether input string is palindrome of the given string or not

public class Q9 {

	public static boolean palindrome(String s) {
		//String
		String rev ="";
		
		boolean ans = false;
		
		
		
		for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
 
        // Checking if both the strings are equal
        if (s.equals(rev)) {
            ans = true;
        }
        return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Number
		int a = 0;
		int sum = 0;
		int temp;
		
		int n =121;
		
		temp=n;
		while(n>0) {
			a=n%10;
			sum=(sum*10)+a;
			n=n/10;
		}
		
		if(temp == sum) {
			System.out.println("palindrome number");
		}
		else
		System.out.println("not palindrome number");
		System.out.println();
	
		
		//String
		  String s = "babba";
		  
	    
	      boolean A = palindrome(s);
	      if(A == true) {
	    	  System.out.println("String is palindrome");
	      }else
	    	  System.out.println("String is not palindrome");
		
	}

}
