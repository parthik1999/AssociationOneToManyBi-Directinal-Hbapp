package com.parthik.beans;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;



@Entity

public class Employee {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empno;
	private String name;
	private int salary;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Department dept;
	
	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
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

	
	
	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empno, String name, int salary, Department dept) {
		super();
		this.empno = empno;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
	

		
	
	
	
	
}
