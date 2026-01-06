package javatasks;

public class IntTask {
	public int getIntValue() {
		int value=20;
		return value;	
	}
	

	public static void main(String[] args) {
		IntTask obj=new IntTask();
		int result=obj.getIntValue();
		System.out.println("returned value :"+result);
	}

}
