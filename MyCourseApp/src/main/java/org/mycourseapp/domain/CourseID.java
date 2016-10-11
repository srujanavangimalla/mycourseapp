package org.mycourseapp.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class CourseID {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
private int courseid;
private String name;
private String courseprereq;
private String coursedes;

@JsonIgnore
@ManyToMany(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })
@JoinTable(name = "cusers", joinColumns = @JoinColumn(name = "course_id", referencedColumnName = "courseid"), inverseJoinColumns = @JoinColumn(name = "user_id", referencedColumnName = "userid"))
private List<UserID> registeredUsers = new ArrayList<>();

@JsonIgnore
@OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
private List<Topics> topics = new ArrayList<>();

public int getCourseid() {
	return courseid;
}
public void setCourseid(int courseid) {
	this.courseid = courseid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCourseprereq() {
	return courseprereq;
}
public void setCourseprereq(String courseprereq) {
	this.courseprereq = courseprereq;
}
public String getCoursedes() {
	return coursedes;
}
public void setCoursedes(String coursedes) {
	this.coursedes = coursedes;
}
@Override
public String toString() {
	return "CourseID [courseid=" + courseid + ", name=" + name + ", courseprereq=" + courseprereq + ", coursedes="
			+ coursedes + "]";
}

}