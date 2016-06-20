package hello;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Person{
	
	@Id
	@GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid2")
	private String id;

	@Column(nullable=false)
	private String firstName;

	@Column(nullable=false)
	private String lastName;

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public void sertLastName(String lastName){
		this.lastName = lastName;
	}



}