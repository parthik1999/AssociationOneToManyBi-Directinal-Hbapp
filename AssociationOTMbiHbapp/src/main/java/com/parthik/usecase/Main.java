package com.parthik.usecase;



import org.hibernate.Session;


import com.parthik.beans.Department;
import com.parthik.beans.Employee;
import com.parthik.util.SessionUtil;

public class Main {

	
	public static void main(String[] args) {
		
		Session ses = SessionUtil.getSession();
		
		
		
		//for access the data from database
		//traversing department to employee
		
		Department dept = ses.get(Department.class,1);
		dept.getEmployees().forEach(e->{
			System.out.println(e.getEmpno());
			System.out.println(e.getName());
			System.out.println(e.getSalary());
			System.out.println(e.getDept().getDname());
			System.out.println(e.getDept().getLocation());
			
			
			System.out.println("=========================");
		}); 
		
		
		//===============================================
		//for storing
		
		
//		Department dept1 = new Department();
//		dept1.setDname("Commputer Engineering");
//		dept1.setLocation("Gandhinagar");
//		
//		Employee emp1 = new Employee();
//		emp1.setName("Parthik");
//		emp1.setSalary(10800);
//		
//		emp1.setDept(dept1);
//		
//		dept1.getEmployees().add(emp1);//now bidrectional
//		
//		
//		Employee emp2 = new Employee();
//		emp2.setName("shubham");
//		emp2.setSalary(10800);
//		emp2.setDept(dept1);
//		dept1.getEmployees().add(emp2);
//		
//		
//		Department dept2 = new Department();
//		dept2.setDname("IT");
//		dept2.setLocation("Gandhinagar");
//		
//		Employee emp3 = new Employee();
//		emp3.setName("Rajesh");
//		emp3.setSalary(10800);
//		emp3.setDept(dept2);
//		dept2.getEmployees().add(emp3);
//		
//		
//		ses.getTransaction().begin();
//		
//		ses.save(dept1);
//		ses.save(dept2);
//		
//		ses.getTransaction().commit();
		
		System.out.println("done");
	}
	
}
