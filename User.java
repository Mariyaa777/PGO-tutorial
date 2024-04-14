
public class User {
	public String name;
	public String lastName;
	public String email;
	
	private String password;
	private boolean isGuest;
	
	User(String name, String lastName, String email, String password){
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		
		this.isGuest = false;
	}
	
	User(String email){
		this.email = email;
		
		this.isGuest = true;
	}

	public void transformGuestIntoUser(String name, String lastName, String password) throws Exception {
		if(this.isGuest) {
			this.name = name;
			this.lastName = lastName;
			this.password = password;
			
			this.isGuest = false;
		}else {
			throw new Exception("User '" + this.email + " is not a guest");
		}
	}
	
	@Override
	 public String toString(){
	
		return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", isGuest='" + isGuest + '\'' + 
               '}';
	}
}
