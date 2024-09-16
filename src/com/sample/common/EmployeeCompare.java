package com.sample.common;

public class EmployeeCompare implements Comparable<EmployeeCompare>{
	
	private int id;
	private String name;
	private int salary;
	private String Dept;
	
	public EmployeeCompare(int id, String name, int salary, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		Dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", Dept=" + Dept + "]";
	}
	@Override
	public int compareTo(EmployeeCompare o) {
		
		if (this.salary < o.salary) {
            return -1;
        } else if (this.salary > o.salary) {
            return 1;
        } else {
            // If salaries are equal, compare by name
            return this.name.compareTo(o.name);
        }
		
	}
	
	

}
