package net.javaguides.springboot.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")

public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	
	private String position;
	private String points;
	
	public User() {
		
	}
	
	public User(String firstName, String lastName, String position, String points) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.position = position;
		this.points = points;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getposition() {
		return position;
	}
	public void setposition(String position) {
		this.position = position;
	}
	public String getpoints() {
		return points;
	}
	public void setpoints(String points) {
		this.points = points;
	}
}
