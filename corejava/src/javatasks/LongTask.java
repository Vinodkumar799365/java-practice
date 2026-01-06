package javatasks;

public class LongTask {
	public long getLongValue() {
		long value=1000;
		return value;
	}

	public static void main(String[] args) {
		LongTask obj=new LongTask();
		long result=obj.getLongValue();
		System.out.println("returned value :"+result);

	}

}
