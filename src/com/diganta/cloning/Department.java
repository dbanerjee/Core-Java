package com.diganta.cloning;

public class Department {
	private Integer deptId;
	private String deptName;
	
	public Department(Integer id, String deptName) {
		this.setDeptId(id);
		this.setDeptName(deptName);
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
