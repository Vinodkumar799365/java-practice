package javatasks;

public class CharTask {
	public char getCharValue() {
		char value='V';
		return value;
	}

	public static void main(String[] args) {
		CharTask obj =new CharTask();
		char result=obj.getCharValue();
		System.out.println("returned value :"+result); 

	}

}
