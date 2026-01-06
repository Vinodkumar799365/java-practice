package Conditional.Statements;


class MyClass3 {
       public int findGreater(int num1, int num2) {
	        if (num1 > num2) {
	            return num1;  
	        } else {
	            return num2;   
	        }
	    }

	    public static void main(String[] args) {

	        MyClass3 obj = new MyClass3();

	        System.out.println("Greater number (10, 25): " + obj.findGreater(10, 25));
	        System.out.println("Greater number (40, 22): " + obj.findGreater(40, 22));
	        System.out.println("Greater number (30, 30): " + obj.findGreater(30, 30));

    }
}


