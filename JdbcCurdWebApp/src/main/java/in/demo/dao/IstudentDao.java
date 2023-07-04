package in.demo.dao;

import in.demo.dto.Student;

public interface IstudentDao {
	
	// operations to be implemented
	public String addStudent(Student student);

	public Student searchStudent(Integer sid);

	public String updateStudent(Student student);

	public String deleteStudent(Integer sid);
	
	

}