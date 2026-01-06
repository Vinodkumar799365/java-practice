package Conditional.Statements;

public class ElectricityBill {

	    public void calculateBill(int customerType, int units) {
	        
	        int rate;
	        
	        switch (customerType) {
	        
	        case 1:  
	            rate = 5;
	            break;
	            
	        case 2:   
	            rate = 8;
	            break;
	            
	        case 3:  
	            rate = 12;
	            break;
	            
	        default:
	            System.out.println("Invalid Customer Type!");
	            return;
	        }
	        
	        int totalBill = rate * units;
	        System.out.println("Total Bill Amount: ₹" + totalBill);
	    }
	    
	    
	    public static void main(String[] args) {
	        
	        ElectricityBill obj = new ElectricityBill();
	        obj.calculateBill(3,14);
	    
	      
	    }
	}

