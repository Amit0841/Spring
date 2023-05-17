package com.masai1;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
private String name;
private List<String> phone;
private Set<String> Addresses;
private Map<String, String> course;
public Employee(String name, List<String> phone, Set<String> addresses, Map<String, String> course) {
	super();
	this.name = name;
	this.phone = phone;
	Addresses = addresses;
	this.course = course;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getPhone() {
	return phone;
}
public void setPhone(List<String> phone) {
	this.phone = phone;
}
public Set<String> getAddresses() {
	return Addresses;
}
public void setAddresses(Set<String> addresses) {
	Addresses = addresses;
}
public Map<String, String> getCourse() {
	return course;
}
public void setCourse(Map<String, String> course) {
	this.course = course;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Employee [name=" + name + ", phone=" + phone + ", Addresses=" + Addresses + ", course=" + course + "]";
}

}
