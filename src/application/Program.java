package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("=== test 1: Seller findById");
		Seller seller = sellerDao.findById(2);

		System.out.println(seller);
		
		System.out.println();
		
		System.out.println("=== test 2: Seller findById");
		Department department = new Department(9,null);
		
		
		List<Seller> list = sellerDao.fingByDepartment(department);

		list.forEach(System.out::println);
		
	}
}
