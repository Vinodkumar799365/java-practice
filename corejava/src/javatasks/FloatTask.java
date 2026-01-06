package javatasks;

public class FloatTask {
	public float getFloatValue() {
		float value=12.34f;
		return value;
	}
	public static void main(String[] args) {
		FloatTask obj=new FloatTask();
		float result=obj.getFloatValue();
		System.out.println("returned value :"+result); 

	}

}
