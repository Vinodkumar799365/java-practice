package javatasks;

public class BooleanTask {
	public boolean getBooleanValue() {
		boolean value=true;
		return value;
	}

	public static void main(String[] args) {
		BooleanTask obj=new BooleanTask();
		boolean result=obj.getBooleanValue();
		System.out.println("returned value :"+result);
	}

}
