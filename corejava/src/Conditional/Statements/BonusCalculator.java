package Conditional.Statements;

public class BonusCalculator {
	public double calculateBonus(int experience,int rating, double salary) {
		if (experience > 5 && rating > 9 ) {
			return salary+(salary*0.50);
			
		} else if (experience > 3 && experience <= 5 && rating > 7 && rating <=9 ) {
			return salary+(salary*0.30);
			
		} else if (experience > 1 && experience <= 3 && rating > 5 && rating <=7 ) {
			return salary+(salary*0.10);
			
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		BonusCalculator obj=new BonusCalculator();
		System.out.println(obj.calculateBonus(6, 10, 10000));
		System.out.println(obj.calculateBonus(4, 9, 10000));
		System.out.println(obj.calculateBonus(3, 6, 10000));
		System.out.println(obj.calculateBonus(1, 2, 10000));
		
	}

}
