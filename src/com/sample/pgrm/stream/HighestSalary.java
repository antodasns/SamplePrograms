package com.sample.pgrm.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import com.sample.common.Employee;

public class HighestSalary {

	public static void main(String[] args) {
		
		List<Employee> empList=getEmpList();
		
		Optional<Employee> highEmp=empList.stream()
				.filter(emp->emp.getDept().equals("MANAGER"))
				.sorted(Comparator.comparing(Employee::getSalary).reversed())
				.findFirst();//.max(Comparator.comparing(Employee::getSalary));
		
		System.out.println(highEmp.get().getName());

	}
	
private static List<Employee> getEmpList(){
		
		List<Employee> empList=new ArrayList<Employee>();
		
		empList.add(new Employee(1,"Anto",10000,"Dev"));
		
		empList.add(new Employee(2,"Ammu",30000,"Tester"));
		
		empList.add(new Employee(3,"ABC",15000,"IMPL"));
		
		empList.add(new Employee(4,"AAA",20000,"MANAGER"));
		
		empList.add(new Employee(4,"XYZ",500000,"MANAGER"));
		
		empList.add(new Employee(4,"BBB",30000,"MANAGER"));
		
		return empList;
		
	}

}
