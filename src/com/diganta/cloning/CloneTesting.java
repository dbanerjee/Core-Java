package com.diganta.cloning;

public class CloneTesting {
	public static void main(String[] args) {
		Department dept = new Department(1, "Human resource");
		Employee empOrig = new Employee(106, "Diganta Banerjee", dept);
		
		//Let's create clone of original object
		try {
			Employee cloned = (Employee) empOrig.clone();
			
			//Testing and Verifying
			System.out.println(cloned.getEmpId());
			
			//Verify JDK's rules
			
	        //Must be true and objects must have different memory addresses
			System.out.println(empOrig != cloned);
			
	        //As we are returning same class; so it should be true
			System.out.println(empOrig.getClass() == cloned.getClass());
			
	        //Default equals method checks for refernces so it should be false. If we want to make it true,
	        //we need to override equals method in Employee class.
			System.out.println(empOrig.equals(cloned));
			
			//Drawback of cloning()
	        //Let change the department name in cloned object and we will verify in original object
			cloned.getDept().setDeptName("ISS");
			
			System.out.println(empOrig.getDept().getDeptName());
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
