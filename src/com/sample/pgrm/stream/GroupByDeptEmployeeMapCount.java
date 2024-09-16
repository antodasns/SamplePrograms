package com.sample.pgrm.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.sample.common.Employee;

public class GroupByDeptEmployeeMapCount {

	public static void main(String[] args) {
		
		List<Employee> empList=getEmpList();
		
		Map<String,Long>empMap=empList.stream()
				.collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));		
		
		
		
		empMap.forEach((key, val) -> {
            System.out.println("Dept: " + key +" Count:"+val);
        });

	}
	
	private static List<Employee> getEmpList(){
		
		List<Employee> empList=new ArrayList<Employee>();
		
		empList.add(new Employee(1,"Anto",10000,"MANAGER"));
		
		empList.add(new Employee(3,"GGG",15000,"Dev"));
		
		empList.add(new Employee(4,"Ammu",20000,"MANAGER"));
		
		empList.add(new Employee(2,"YYY",30000,"Tester"));
		
		empList.add(new Employee(2,"xyz",30000,"Dev"));
		return empList;
		
	}

}
