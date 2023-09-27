package com.gl.mycollection;

public class Employee {
	//POJO 
		String empId;
		String empName;
		String empAddress;
		String empPhone;
		float salary;
		
		public Employee() {
			super();
		}

		public Employee(String empId, String empName, String empAddress, String empPhone, float salary) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.empAddress = empAddress;
			this.empPhone = empPhone;
			this.salary = salary;
		}

		public String getEmpId() {
			return empId;
		}

		public void setEmpId(String empId) {
			this.empId = empId;
		}

		public String getEmpName() {
			return empName;
		}

		public void setEmpName(String empName) {
			this.empName = empName;
		}

		public String getEmpAddress() {
			return empAddress;
		}

		public void setEmpAddress(String empAddress) {
			this.empAddress = empAddress;
		}

		public String getEmpPhone() {
			return empPhone;
		}

		public void setEmpPhone(String empPhone) {
			this.empPhone = empPhone;
		}

		public float getSalary() {
			return salary;
		}

		public void setSalary(float salary) {
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + ", empPhone="
					+ empPhone + ", salary=" + salary + "]";
		}/**/
		
		
		

}
