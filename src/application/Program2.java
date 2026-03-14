package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("===Test 1: department Insert===");
		Department department = new Department(null, "Games");
		departmentDao.insert(department);
		System.out.println("Inserted! New Id = " + department.getId());
		
		System.out.println("===Test 2: department Delete===");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete Completed!");
		sc.close();
		
		System.out.println("===Test 4: department findById===");
		department = departmentDao.findById(3);
		System.out.println(department);
		
		System.out.println("===Test 3: department Update===");
		department = departmentDao.findById(4);
		department.setName("Kitchen");
		departmentDao.update(department);
		System.out.println("Update completed!");

	}

}
