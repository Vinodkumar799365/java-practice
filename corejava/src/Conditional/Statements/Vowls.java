package Conditional.Statements;

public class Vowls {
	public void vowelCons(char ch) {
		
	  if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
          System.out.println(ch + " is Vowel");
      } else {
          System.out.println(ch + " is Consonant");
      }
	}

	public static void main(String[] args) {
		Vowls obj=new Vowls();
		obj.vowelCons('a');
	

	}

}
