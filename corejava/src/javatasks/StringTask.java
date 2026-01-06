package javatasks;

public class StringTask {
	public String getStringValue() {
		String value="gwen peter";
		return value;
	}

	public static void main(String[] args) {
		StringTask obj =new StringTask();
		String result=obj.getStringValue();
		System.out.println("returned value :"+result); 

	}

}
