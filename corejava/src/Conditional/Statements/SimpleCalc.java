package Conditional.Statements;

public class SimpleCalc {
	public void performOperations(double num1,double num2, char op) {
		switch(op){
		case '+':
			System.out.println("addition :"+(num1+num2));
			break;
		case '-':
			System.out.println("subtraction :"+(num1-num2));
			break;
		case '*':
			System.out.println("multiplication :"+(num1*num2));
			break;
		case '/':
			if(num2!=0) {
				System.out.println("division :"+(num1/num2));
			}else {
				System.out.println("divisible is not valid ");
			}
			break;
			default:
				System.out.println("invalid expression");
		}
	}

	public static void main(String[] args) {
		SimpleCalc obj=new SimpleCalc();
		obj.performOperations(10,2,'+');
		obj.performOperations(10,2,'-');
		obj.performOperations(10,2,'*');
		obj.performOperations(10,0,'/');
		obj.performOperations(10,2,'%');

	}

}
