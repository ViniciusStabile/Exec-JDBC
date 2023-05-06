package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== test 1 Insert Department");
		Department dep = new Department(null,"Beauty");
		
		departmentDao.insert(dep);
		
		

	}

}
