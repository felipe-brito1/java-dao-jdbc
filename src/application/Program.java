package application;

import java.time.LocalDate;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Department db = new Department(1, "Books");
		
		Seller seller = new Seller (21, "Bob", "bob@gmail.com", LocalDate.of(2000, 04, 01), 3000.0, db);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(seller);
	}
	

}
