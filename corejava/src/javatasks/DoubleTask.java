package javatasks;

public class DoubleTask {
	public double getDoubleValue() {
		double value=20.20;
		return value;
	}

	public static void main(String[] args) {
		DoubleTask obj=new DoubleTask();
		double result=obj.getDoubleValue();
		System.out.println("reyurned value :"+result); 

	}

}
