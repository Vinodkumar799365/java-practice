package Loops;

public class Palindrome {
	public void isPalindrome(int num) {
		//int num=1234321;
		int temp=num;
		int rev=0;
		while(num!=0) {
			
			int rem=num%10;
			rev=rev * 10 + rem;
			num /=10;
		}
				System.out.println((rev==temp)?"palindrome" : "not a palindrome");
			
		}
	
	

	public static void main(String[] args) {
		Palindrome obj=new Palindrome();
		obj.isPalindrome(1234321);

	}

}
