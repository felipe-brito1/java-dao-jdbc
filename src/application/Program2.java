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
		Department department = new Department(5, "Food");
		departmentDao.insert(department);
		System.out.println(department);
		
		System.out.println("===Test 2: department Delete===");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete Completed!");
		sc.close();

	}

}
