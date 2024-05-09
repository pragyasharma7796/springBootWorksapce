package com.app.demo.model;

public class Student {
	
	private Integer stuId;
	private String name;
	private String contactNo;
	private String course;
	private String sem;
	public Integer getStuId() {
		return stuId;
	}
	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getSem() {
		return sem;
	}
	public void setSem(String sem) {
		this.sem = sem;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", name=" + name + ", contactNo=" + contactNo + ", course=" + course
				+ ", sem=" + sem + "]";
	}
	
}
