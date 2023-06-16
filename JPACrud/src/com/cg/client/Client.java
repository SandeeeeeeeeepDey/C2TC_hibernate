package com.cg.client;
import com.cg.entity.Student;
import com.cg.service.StudentService;
import com.cg.service.StudentServiceImplimentable;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
public class Client {
	private static Student student;
	private static StudentService service;
	
	public static void main(String[] args)  {
		
		student= new Student(); // Instantiate Student class
		
		service= new StudentServiceImplimentable();  // Instantiate StudentService class
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Services: \n 1-CREATE/PERSIST \n 2-RETRIEVE/FIND \n 3-UPDATE/MERGE \n 4-DELETE/REMOVE \nEnter number of the corresponding service.");
		int serve=sc.nextInt();
		
		switch(serve) {
		case 1: {
			System.out.println("Enter your NEW ID");
			int id=sc.nextInt(); // id input
			sc.nextLine();
			
			System.out.println("Enter the name for your ID number: "+id);
			String name=sc.nextLine(); // name input
			
			add(id,name); // feeding to local method for legibility
			
			System.out.println("Name \""+name+ "\" has been added to ID: "+id+"\n");
			main(new String[0]);
			break;
			}
		case 2: {
			System.out.println("Enter the ID you want to RETRIEVE information of");
			int id=sc.nextInt(); // id input
			sc.nextLine();
			
			Student s;
			try {
				s = service.getStudentByID(id); // getting the Student info in variable s
				System.out.println("Information for Student ID "+ s.getStudentID()+" is: "+s.getName()+"\n");
			} catch (Exception e) {
				System.out.println("The ID does not exist in the database"+"\n");
			}
			
			main(new String[0]);
			break;
		}
		case 3: {
			System.out.println("Enter the ID whose Information you want to update.");
			int id=sc.nextInt(); // id input
			sc.nextLine();
	
			try {
				Student s=service.getStudentByID(id); // getting the Student info in variable s
				
				System.out.println("Enter the name for your ID number: "+id);
				String name=sc.nextLine(); // change name input
				
				s.setName(name); // changing name
				service.updateStudent(s); // sending update to database
				
			} catch (Exception e) {
				System.out.println("The ID does not exist in the database"+"\n");
			}
			
			main(new String[0]);
			break;
		}
		case 4:{
			System.out.println("Enter the ID you want to delete.");
			int id=sc.nextInt(); // id input
			sc.nextLine();
			
			try {
			Student s=service.getStudentByID(id); // getting the Student info in variable s
			
			service.deleteStudent(s); // Deleting the info wrt. ID
			System.out.println("ID number "+id+" has been deleted"+"\n");
			
			}catch(Exception e) {
				System.out.println("The ID does not exist in the database"+"\n");
			}
			
			
			main(new String[0]);
			break;
		}
	
		}

	}
	
	// Wrapped addStudent()
	static void  add(int id, String name) {
		
		try {
			student.setStudentID(id);
			student.setName(name);
			service.addStudent(student);
		} catch (Exception e) {
			System.out.println("ID already exist."+"\n");
		}
	}

}
