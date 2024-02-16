package pojo.jsonresponsetopojo;

public class Employeepojonested {
	
	
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private double salary;
	
	private  EmployeeAddressPojo  address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public EmployeeAddressPojo getAddress() {
		return address;
	}

	public void setAddress(EmployeeAddressPojo address) {
		this.address = address;
	}
	
	
	
	
	

}
