
public class Studentdemo 
{
	private int id;
    private String fname;
    private String lname;
    private String email;
    private String mobile;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	 public void displayInfo() {
	        System.out.println("Id: " + id);
	        System.out.println("First Name: " + fname);
	        System.out.println("Last Name: " + lname);
	        System.out.println("Email: " + email);
	        System.out.println("Mobile: " + mobile);

}
}
