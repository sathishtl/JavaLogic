package com.test.day16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class EmplyeeList {
	
	
	public static void main(String[] args) {
		
		
		
		int value=7583657;
		
		
		while(value>0){
			
			System.out.print(value%10);
			value=value/10;
			
		}
		
	}
	
	
	public static void stringContains(String[] args) {
		
		
		String tmp = "Once in a blue moon";
		String tmp2= "See eye to eye  blue moon";
		
		
		//System.out.println(tmp2.contains(tmp));
		
		if(tmp2.indexOf(tmp) ==-1){
			System.out.println("false");
		}else{
			System.out.println("true");
		}
	}

	public static void listEMp(String[] args) {

		List<Employee> listEmp = new ArrayList<Employee>();

		// 1
		Employee emp1 = new Employee();
		emp1.setAge(20);
		emp1.setName("ABC");
		emp1.setEmployeeId("0008");

		// 2
		Employee emp2 = new Employee();
		emp2.setAge(25);
		emp2.setName("XYZ");
		emp2.setEmployeeId("0006");

		// 3
		Employee emp3 = new Employee();
		emp3.setAge(35);
		emp3.setName("PQR");
		emp3.setEmployeeId("0028");
		// 4
		Employee emp4 = new Employee();
		emp4.setAge(22);
		emp4.setName("EFG");
		emp4.setEmployeeId("0258");
		// 5
		Employee emp5 = new Employee();
		emp5.setAge(28);
		emp5.setName("KLM");
		emp5.setEmployeeId("0778");
		
		listEmp.add(emp1);
		listEmp.add(emp2);
		listEmp.add(emp3);
		listEmp.add(emp4);
		listEmp.add(emp5);
		
		
		TreeMap<Integer, Employee> hashemp=new TreeMap<Integer, Employee>();
		
		
		
		hashemp.put(emp1.getAge(), emp1);
		hashemp.put(emp2.getAge(), emp2);
		hashemp.put(emp3.getAge(), emp3);
		hashemp.put(emp4.getAge(), emp4);
		hashemp.put(emp5.getAge(), emp5);
		
		
		Set<Integer> keys= hashemp.keySet();
		
		for (Integer key : keys) {
			System.out.println("Employee Id:" + hashemp.get(key).getEmployeeId() +"  Emp name :"+ hashemp.get(key).getName()+ "  Age:"+ hashemp.get(key).getAge());
		}
		
		
		
//		Collections.sort(listEmp, new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee e1, Employee e2) {
//
//				return e1.getAge() > e2.getAge() ? 1 : -1;
//			}
//		});
//		
//		for (Employee employee : listEmp) {
//			
//			
//			System.out.println("Employee Id:" + employee.getEmployeeId() +"  Emp name :"+ employee.getName()+ "  Age:"+ employee.getAge());
//		}

	}
}
