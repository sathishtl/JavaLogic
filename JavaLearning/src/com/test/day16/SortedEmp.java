package com.test.day16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class SortedEmp {

	
	public static void main(String[] args) {
		
		List<Employee> listemp=read();
		
		Collections.sort(listemp, new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				
				return e1.getName().compareTo(e2.getName());
			}
		});
		
		
		for (Employee employee : listemp) {
			System.out.println("Employee Id:" + employee.getEmployeeId() +"  Emp name :"+ employee.getName()+ "  Age:"+ employee.getAge());
		}
		
	}

	private static List<Employee> read() {


		List<Employee> employee= new ArrayList<Employee>();
		try {
			BufferedReader reader =new BufferedReader(new FileReader("C:\\Sathish\\Oct2018\\first.csv"));
			
			String st= null;
			
			st=reader.readLine();
			
			while ((st=reader.readLine()) !=null) {
				
				
				System.out.println(st);
				
				StringTokenizer token = new StringTokenizer(st, ",");
				
				while (token.hasMoreElements()) {
					
					Employee emp= new Employee();
					emp.setEmployeeId((String) token.nextElement());
					emp.setName((String) token.nextElement());
					emp.setAge(Integer.parseInt((String)token.nextElement()));
					emp.setAddress((String) token.nextElement());
					
					employee.add(emp);
				}
				
				
			}
			reader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employee;
		
	}
}
