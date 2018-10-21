package com.test.readingXml;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.test.day16.Employee;

public class ReadXml {
	public static void main(String[] args) {

		try {
			File xmlfile = new File("C:\\Sathish\\Oct2018\\Employees.xml");

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

			DocumentBuilder dbuilder = dbFactory.newDocumentBuilder();

			Document doc = dbuilder.parse(xmlfile);
			
			doc.getDocumentElement().normalize();
			
			
			NodeList nList = doc.getElementsByTagName("employee");
			
			List<Employee> listEmp = new ArrayList<Employee>();

			for (int i = 0; i < nList.getLength(); i++) {
				
				Node node = nList.item(i);
				
				
				
				Element element = (Element)node;
				
				
				Employee emp1 = new Employee();
				emp1.setAge(Integer.parseInt(element.getElementsByTagName("age").item(0).getTextContent()));
				emp1.setName(element.getElementsByTagName("name").item(0).getTextContent());
				emp1.setEmployeeId(element.getElementsByTagName("id").item(0).getTextContent());
				emp1.setAddress(element.getElementsByTagName("address").item(0).getTextContent());
				
			
				
				listEmp.add(emp1);
			}
			
			for (Employee emp : listEmp) {
				System.out.println("Employee Id:" + emp.getEmployeeId() +"  Emp name :"+ emp.getName()+ "  Age:"+ emp.getAge());
			}
			xmlfile= null;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
