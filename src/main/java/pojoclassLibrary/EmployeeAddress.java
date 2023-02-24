package pojoclassLibrary;

public class EmployeeAddress {
	
	String email;
	int[] phNo;
	String city;
	String state;
	int pincode;
	
	public EmployeeAddress(String email, int[] phNo, String city, String state, int pincode) {
		super();
		this.email = email;
		this.phNo = phNo;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	public String getEmail() {
		return email;
	}
	
	public EmployeeAddress() {
		
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int[] getPhNo() {
		return phNo;
	}
	public void setPhNo(int[] phNo) {
		this.phNo = phNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	
	

}
