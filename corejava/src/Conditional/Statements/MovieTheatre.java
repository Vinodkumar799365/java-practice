package Conditional.Statements;

public class MovieTheatre {
	public double getTicketPrice(int age) {
		if(age < 5) {
			return 0.0;
		}else if (age >= 5 && age <= 12 ) {
			return 5.0;
		}else if (age >= 13 && age <= 60 ) {
			return 10.0;
		}else {
			return 5.0;
		}
	}

	public static void main(String[] args) {
		MovieTheatre mt=new MovieTheatre();
		System.out.println("age 3 ticket price $: "+mt.getTicketPrice(3));
		System.out.println("age 10 ticket price $: "+mt.getTicketPrice(10));
		System.out.println("age 55 ticket price $: "+mt.getTicketPrice(55));
		System.out.println("age 65 ticket price $: "+mt.getTicketPrice(65));
		
	}

}
