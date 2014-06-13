package com.diganta.cloning;

public class Employee implements Cloneable{
	private Integer empId;
	private String empName;
	private Department dept;
	
	public Employee(Integer empId, String empName, Department department) {
		this.empId = empId;
		this.empName = empName;
		this.dept = department;
	}
	
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		//return super.clone();
		Employee cloned = (Employee) super.clone();
		cloned.setDept((Department)cloned.getDept().clone());
		return cloned;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(obj == this) {
			return true;
		}
		if(getClass() != obj.getClass()) {
			return false;
		}
		Employee e = (Employee) obj;
		return (this.getEmpId() == e.getEmpId());
	}

}
