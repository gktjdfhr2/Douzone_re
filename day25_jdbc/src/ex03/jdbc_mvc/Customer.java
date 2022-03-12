package ex03.jdbc_mvc;

public class Customer {
	
	public final String className = "Customer";
	//code, name, email, phone
	
	private int code;
	private String name;
	private String email;
	private String phone;
	public String getClassName() {
		return className;
	}
	public int getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getPhone() {
		return phone;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
