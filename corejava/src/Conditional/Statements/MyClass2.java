package Conditional.Statements;


class MyClass2 {

	  public boolean canVote(int age) {
	        if (age >= 18) {
	            return true;   
	        } else {
	            return false;  
	        }
	    }

	    public static void main(String[] args) {

	        MyClass2 obj = new MyClass2();

	        System.out.println("Can vote (Age 20) : " + obj.canVote(20));
	        System.out.println("Can vote (Age 15) : " + obj.canVote(15));
    }
}


