package com.sample.pgrm.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.sample.common.Employee;

public class AscendingSalaryEmployee {

	public static void main(String[] args) {
		
		List<Employee> ascList=new ArrayList<Employee>();
		
		List<Employee> dscList=new ArrayList<Employee>();
		
		List<Employee> empList=getEmpList();
		
		ascList=empList.stream()
				.sorted(Comparator.comparing(Employee::getSalary))
				.collect(Collectors.toList());
		
		dscList=empList.stream()
				.sorted(Comparator.comparing(Employee::getSalary).reversed())
				.collect(Collectors.toList());
		
		System.out.println(ascList);
		
		System.out.println(dscList);
		
		
		
	}
	
	private static List<Employee> getEmpList(){
		
		List<Employee> empList=new ArrayList<Employee>();
		
		empList.add(new Employee(1,"Anto",10000,"Dev"));
		
		empList.add(new Employee(2,"Ammu",30000,"Tester"));
		
		empList.add(new Employee(3,"ABC",15000,"IMPL"));
		
		empList.add(new Employee(4,"XYZ",20000,"MANAGER"));
		return empList;
		
	}

}
