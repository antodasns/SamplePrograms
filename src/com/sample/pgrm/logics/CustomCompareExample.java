package com.sample.pgrm.logics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.sample.common.Employee;
import com.sample.common.EmployeeCompare;

public class CustomCompareExample {
	
public static void main(String[] args) {
	
		class SalaryComparator implements Comparator<Employee> {
			public int compare(Employee s1, Employee s2) {
			return Integer.compare(s1.getSalary(), s2.getSalary());
			}
		}
		
		List<EmployeeCompare> empList=getEmpComparatorList();
		
		List<Employee> empList2=getEmpList();
		
		Collections.sort(empList);
		
		//Collections.sort(empList2,new SalaryComparator());
		
		Collections.sort(empList2,Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary));
		
		System.out.println(empList);
		
		System.out.println(empList2);
		
	}
	
	private static List<EmployeeCompare> getEmpComparatorList(){
		
		List<EmployeeCompare> empList=new ArrayList<EmployeeCompare>();
		
		empList.add(new EmployeeCompare(4,"XYZ",20000,"MANAGER"));
		
		empList.add(new EmployeeCompare(1,"Anto",10000,"MANAGER"));
		
		empList.add(new EmployeeCompare(2,"YYY",30000,"MANAGER"));
		
		empList.add(new EmployeeCompare(3,"GGG",15000,"IMPL"));
		
		return empList;
		
	}
	
	private static List<Employee> getEmpList(){
		
		List<Employee> empList=new ArrayList<Employee>();
		
		empList.add(new Employee(4,"XYZ",20000,"MANAGER"));
		
		empList.add(new Employee(1,"Anto",10000,"MANAGER"));
		
		empList.add(new Employee(2,"YYY",30000,"MANAGER"));
		
		empList.add(new Employee(3,"GGG",15000,"IMPL"));
		
		return empList;
		
	}

}
