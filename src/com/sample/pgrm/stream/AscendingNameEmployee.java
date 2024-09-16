package com.sample.pgrm.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.sample.common.Employee;

public class AscendingNameEmployee {

	public static void main(String[] args) {
		
		List<Employee> ascList=new ArrayList<Employee>();
		
		List<Employee> empList=getEmpList();
		
		ascList=empList.stream().filter(emp->emp.getDept().equals("MANAGER"))
				.sorted(Comparator.comparing(Employee::getName))//Comparator.comparing(Employee::getSalary).reversed() 
				.collect(Collectors.toList());
		
		ascList.stream().map(Employee::getName).forEach(System.out::println);
		
		ascList.forEach(emp -> System.out.println(" - " + emp.getName()));
		
	}
	
	private static List<Employee> getEmpList(){
		
		List<Employee> empList=new ArrayList<Employee>();
		
		empList.add(new Employee(1,"Anto",10000,"MANAGER"));
		
		empList.add(new Employee(3,"GGG",15000,"IMPL"));
		
		empList.add(new Employee(4,"XYZ",20000,"MANAGER"));
		
		empList.add(new Employee(2,"YYY",30000,"MANAGER"));
		return empList;
		
	}

}
