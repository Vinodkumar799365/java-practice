package Conditional.Statements;


class MyClass4 {
      

	    public boolean isDivisibleBy5(int num) {
	        if (num % 5 == 0) {
	            return true;  
	        } else {
	            return false; 
	        }
	    }

	    public static void main(String[] args) {

	        MyClass4 obj = new MyClass4();

	        System.out.println("Is 15 divisible by 5 : " + obj.isDivisibleBy5(15));
	        System.out.println("Is 22 divisible by 5 : " + obj.isDivisibleBy5(22));
	    }
	}


