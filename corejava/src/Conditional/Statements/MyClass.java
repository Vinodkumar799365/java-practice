package Conditional.Statements;

public class MyClass {

	    public boolean isEven(int num) {
	        
	        if (num % 2 == 0) {
	            return true;    
	        } else {
	            return false;  
	        }
	    }

	    public static void main(String[] args) {

	        MyClass obj = new MyClass();

	        System.out.println("Is 10 even " + obj.isEven(10));
	        System.out.println("Is 7 even " + obj.isEven(7));
	    }
}
