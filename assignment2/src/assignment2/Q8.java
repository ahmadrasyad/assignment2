package assignment2;

//write a java program to find all the permutations of the given string

public class Q8 {

	static void permutations(String str, String ans) {
		
		if(str.length() == 0) {
			System.out.print(ans + " ");
			return;
			
		}
		
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			String s1 = str.substring(0,i)+
						str.substring(i+1);
			
			permutations(s1,ans+c);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "acc";
		permutations(s,"");
		
	}

}
