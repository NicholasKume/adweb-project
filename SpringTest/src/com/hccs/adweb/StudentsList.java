package com.hccs.adweb;

import java.util.ArrayList;

public class StudentsList {

	private static ArrayList<Student> studentsList = null;
	
	public static ArrayList<Student> getStudentsList() {
		//if ((studentsList == null) && (studentsList.size() == 0)) {
			studentsList = new ArrayList<Student>();
			studentsList.add(new Student(1,"Nick","Kume"));
			studentsList.add(new Student(2,"Jose","Gonzales"));
			studentsList.add(new Student(3,"Jim","Smith"));
			studentsList.add(new Student(4,"Carlos","Shah"));
			studentsList.add(new Student(5,"Kelly","Branco"));
		//}
		System.out.println("Student List ---->"+studentsList);
		return studentsList;
	}
	public static void setStudentsList(ArrayList<Student> studentsList) {
		studentsList = studentsList;
	}

	

}
