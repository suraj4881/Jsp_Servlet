package in.demo.service;

import in.demo.dao.IstudentDao;
import in.demo.daofactory.StudentDaoFactory;
import in.demo.dto.Student;

public class IstudentImplService implements IstudentService  {

	private IstudentDao stdDao;
	
	@Override
	public String addStudent(Student student) {
		
		stdDao = StudentDaoFactory.getStudentDao();
		return stdDao.addStudent(student);
	}

	@Override
	public Student searchStudent(Integer sid) {
		stdDao = StudentDaoFactory.getStudentDao();
		return stdDao.searchStudent(sid);
	}

	@Override
	public String updateStudent(Student student) {
		stdDao = StudentDaoFactory.getStudentDao();
		return stdDao.updateStudent(student);
	}

	@Override
	public String deleteStudent(Integer sid) {
		stdDao = StudentDaoFactory.getStudentDao();
		return stdDao.deleteStudent(sid);
	}

	

	

}
