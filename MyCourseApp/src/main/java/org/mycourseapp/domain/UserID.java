package org.mycourseapp.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class UserID {

	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
private int userid;
private String username;
private String firstname;
private String lastname;
private long phonenumber;
private long DOB;
private String passwrod;

@JsonIgnore
@ManyToMany(mappedBy = "registeredUsers", cascade = CascadeType.ALL)
private List<CourseID> courses = new ArrayList<>();

public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
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
public long getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(long phonenumber) {
	this.phonenumber = phonenumber;
}
public long getDOB() {
	return DOB;
}
public void setDOB(long dOB) {
	DOB = dOB;
}
public String getPasswrod() {
	return passwrod;
}
public void setPasswrod(String passwrod) {
	this.passwrod = passwrod;
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
@Override
public String toString() {
	return "UserID [userid=" + userid + ", username=" + username + ", firstname=" + firstname + ", lastname=" + lastname
			+ ", phonenumber=" + phonenumber + ", DOB=" + DOB + ", passwrod=" + passwrod + "]";
}
}
