package org.mycourseapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class Topics {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int topicid;
private String name;
private String duration;

@JsonIgnore
@ManyToOne
@JoinColumn(name = "course_id")
private CourseID course;

public int getTopicid() {
	return topicid;
}
public void setTopicid(int topicid) {
	this.topicid = topicid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDuration() {
	return duration;
}
public void setDuration(String duration) {
	this.duration = duration;
}
@Override
public String toString() {
	return "Topics [topicid=" + topicid + ", name=" + name + ", duration=" + duration + "]";
}
}
