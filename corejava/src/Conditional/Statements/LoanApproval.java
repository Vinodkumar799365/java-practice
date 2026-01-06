package Conditional.Statements;

public class LoanApproval {
	 public String checkLoanApproval(double salary, int creditScore) {

	        if (salary > 80000 && creditScore > 750) {
	            return ":- Loan Approved Immediately";

	        } else if (salary >= 50000 && salary <= 80000 && creditScore >= 650 && creditScore <= 750) {

	            return ":- Loan Approved with Higher Interest Rate";

	        } else if (salary >= 30000 && salary < 50000 && creditScore >= 500 && creditScore <= 650) {

	            return ":- Co-signer Required";

	        } else {
	            return ":- Loan Rejected";
	        }
	    }

	    public static void main(String[] args) {

	        LoanApproval obj = new LoanApproval();

	        System.out.println(obj.checkLoanApproval(90000, 780)); 
	        System.out.println(obj.checkLoanApproval(60000, 700));
	        System.out.println(obj.checkLoanApproval(40000, 600));
	        System.out.println(obj.checkLoanApproval(25000, 450)); 
	    }

}
