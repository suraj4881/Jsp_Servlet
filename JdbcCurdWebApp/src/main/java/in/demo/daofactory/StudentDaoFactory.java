package in.demo.daofactory;

import in.demo.dao.IstudentDao;
import in.demo.dao.IstudentImplDao;

public class StudentDaoFactory {

	private StudentDaoFactory() {}

	private static IstudentDao studentDao = null;

	public static IstudentDao getStudentDao() {
		if (studentDao == null) {
			studentDao = new IstudentImplDao();
		}
		return studentDao;
	}
}

