
public class TaxReturn {
	
	String socialSecurityNumber;
	String firstName;
	String lastName;
	String streetAddress;
	String city;
	String state;
	String zipCode;
	String maritalStatus;
	double annualIncome;
	double taxLiability;
	
	public TaxReturn(String socialSecurityNumber, String firstName, String lastName, String streetAddress, String city, String state, String zipCode, String maritalStatus, double annualIncome, double taxLiability) {
		this.socialSecurityNumber = socialSecurityNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.maritalStatus = maritalStatus;
		this.annualIncome = annualIncome;
		
		if(maritalStatus.equals("MARRIED")) {
			if(annualIncome >= 0 && annualIncome <= 20000) {
				taxLiability = annualIncome * 0.14;
			}
			else if(annualIncome >= 20001 && annualIncome <= 50000) {
				taxLiability = annualIncome * 0.2;
			}
			else {
				taxLiability = annualIncome * 0.28;
			}
		} 
		
		if(maritalStatus.equals("SINGLE")) {
			if(annualIncome >= 0 && annualIncome <= 20000) {
				taxLiability = annualIncome * 0.15;
			}
			else if(annualIncome >= 20001 && annualIncome <= 50000) {
				taxLiability = annualIncome * 0.22;
			}
			else {
				taxLiability = annualIncome * 0.30;
			}
		}
	}
	
	public void display() {
		System.out.println("Social Security Number: " + socialSecurityNumber + "\nFirst Name: " + firstName +
						   "\nLast Name: " + lastName + "\nStreet Address: " + streetAddress + "\nCity: " + city +
						   "\nState: " + state + "\nZip Code: " + zipCode + "\nMarital Status");
	}
	
	
}
