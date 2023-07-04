package in.demo.servicefactory;

import in.demo.service.IstudentImplService;
import in.demo.service.IstudentService;

//Abstraction logic of implementation
public class StudentServiceFactory {

	//make constuctor private to avoid object creation
	private StudentServiceFactory() {

	}

	private static IstudentService studentService = null;

	public static IstudentService getStudentService() {
		
		//singleton pattern code
		if (studentService == null) {
			studentService = new IstudentImplService();
		}
		return studentService;
	}

}
