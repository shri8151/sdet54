package pojoclassLibrary;


public class EmployeeObjectArray extends EmployeeAddress {

	String name;
	String eid;
	String dept;
	long sal;
	int[] phoneNo;
	Object address;

	public EmployeeObjectArray(String name, String eid, String dept, long sal, int[] phoneNo,Object address) {
		super();
		this.name = name;
		this.eid = eid;
		this.dept = dept;
		this.sal = sal;
		this.phoneNo = phoneNo;
		this.address=address;
		
	}
	public EmployeeObjectArray(String name, String eid, String dept, long sal, int[] phoneNo) {

		this.name = name;
		this.eid = eid;
		this.dept = dept;
		this.sal = sal;
		this.phoneNo = phoneNo;
		
		
	}
	
	public EmployeeObjectArray() {

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public long getSal() {
		return sal;
	}
	public void setSal(long sal) {
		this.sal = sal;
	}
	public int[] getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int[] phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Object getAddress() {
		return address;
	}
	public void setAddress(Object emp) {
		this.address = emp;
	}
	
	

	

//	/public String getPhoneNo1() {
//		return Arrays.toString(phoneNo);
//	}




}
