package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== test 1 Insert Department");
		Department newDepartment = new Department(null,"music");
		
		departmentDao.insert(newDepartment);
		
		
		System.out.println("=== test 2 findById Department");
		Department dep = departmentDao.findById(2);
		System.out.println(dep);
		

	}

}
