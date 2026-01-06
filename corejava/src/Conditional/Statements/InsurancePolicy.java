package Conditional.Statements;

public class InsurancePolicy {
	public String calculatePremium(int age,int experience) {
		if (age > 50 && experience >= 10 ) {
			return "lowest premium";
		} else if (age > 30 && age <= 50 && experience >= 5 && experience < 10) {
			return "moderate premium";
		} else if (age > 18 && age <= 30 && experience > 0 && experience < 5 ) {
			return "highest premium";
		} else {
			return "not eligible for insurance";
		}
	}

	public static void main(String[] args) {
		InsurancePolicy obj=new InsurancePolicy();
		System.out.println(obj.calculatePremium(52, 11));
		System.out.println(obj.calculatePremium(50, 9));
		System.out.println(obj.calculatePremium(19, 2));
		System.out.println(obj.calculatePremium(18, 1));
		

	}

}
