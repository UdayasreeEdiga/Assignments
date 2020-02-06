package cts.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="TabStudents")

public class Student {
	@EmbeddedId
	private StudentIdentity sid;
	@Column(name="fnm", nullable=false)
	private String firstname;
	@Column(name="lnn")
	private String Lastname;
	@Column (name="dob" ,nullable=false)
	private Date dateofbirth;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(StudentIdentity sid, String firstname, String lastname, Date dateofbirth) {
		super();
		this.sid = sid;
		this.firstname = firstname;
		Lastname = lastname;
		this.dateofbirth = dateofbirth;
	}

	public StudentIdentity getSid() {
		return sid;
	}

	public void setSid(StudentIdentity sid) {
		this.sid = sid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public Date getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", firstname=" + firstname + ", Lastname=" + Lastname + ", dateofbirth="
				+ dateofbirth + "]";
	}
	
	
	

}
