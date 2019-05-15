package cs.csdepartment.entities;

public class Client {
	
	public Client(int idclient, String name, String email, String username, String password) {
		super();
		this.idclient = idclient;
		this.name = name;
		this.email = email;
		this.username = username;
		this.password = password;
	}
	private int idclient;
	private String name;
	private String email;
	private String username;
	private String password;
	public int getIdclient() {
		return idclient;
	}
	public void setIdclient(int idclient) {
		this.idclient = idclient;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
