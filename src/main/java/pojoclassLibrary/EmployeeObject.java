package pojoclassLibrary;

public class EmployeeObject {

	String name;
	String eid;
	String dept;
	long sal;
	
	public EmployeeObject(String name, String eid, String dept, long sal) {
		this.name = name;
		this.eid = eid;
		this.dept = dept;
		this.sal = sal;
	}
	
	public EmployeeObject() {
		
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
	
}
