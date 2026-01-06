package javatasks;

public class ShortTask {
	public short getShortValue() {
		short value=30;
		return value;
	}

	public static void main(String[] args) {
		ShortTask obj=new ShortTask();
		short result=obj.getShortValue();
		System.out.println("returnd value :"+result);

	}

}
