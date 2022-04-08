package com.mycompany;

import java.sql.SQLException;
import java.util.Scanner;

import com.mycompany.ProductMangementDAO;
import com.mycompany.Product;
public class ProductMangementApp {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.println("----------------------------------------");
			System.out.println("A. View Products");
			System.out.println("B. Add Product");
			System.out.println("C. Update Product");
			System.out.println("D. Delete Product");
			System.out.println("E. Search Product");
			System.out.println("F. Exit");
			System.out.println("=========================");
			System.out.println("Enter an option");
			System.out.println("=========================");

			String ch = sc.next();
			switch (ch) {
			case "A":
				Product pb = new Product();
				int rows = ProductMangementDAO.viewall(pb);
				break;
			case "B":
				System.out.println("-----------------------------");
				System.out.println("Enter the Product ID");
				System.out.println("-----------------------------");

				Product pb1 = new Product();
				pb1.setId(sc.nextInt());
				System.out.println("-----------------------------");

				System.out.println("Enter the Product Name");
				System.out.println("-----------------------------");

				pb1.setName(sc.next());
				System.out.println("-----------------------------");

				System.out.println("Enter the Product Price");
				System.out.println("-----------------------------");

				pb1.setPrice(sc.nextInt());
				ProductMangementDAO scrud1 = new ProductMangementDAO();
				int rows1 = ProductMangementDAO.insert(pb1);
				if (rows1 > 0) {
					System.out.println("-----------------------------");

					System.out.println("Product added successfully");
					System.out.println("-----------------------------");

				} else {
					System.out.println("-----------------------------");

					System.out.println("Faild!!!");
					System.out.println("-----------------------------");

				}

				break;

			case "C":

				Product pb2 = new Product();
				System.out.println("-----------------------------");

				System.out.println("Enter Product Id:");
				System.out.println("-----------------------------");

				pb2.setId(sc.nextInt());
				System.out.println("-----------------------------");

				System.out.println("Enter New Product Name");
				System.out.println("-----------------------------");

				pb2.setName(sc.next());
				System.out.println("-----------------------------");

				System.out.println("Enter New Product Price");
				System.out.println("-----------------------------");

				pb2.setPrice(sc.nextInt());
				ProductMangementDAO scrud2 = new ProductMangementDAO();
				int rows2 = ProductMangementDAO.update(pb2);
				if (rows2 > 0) {
					System.out.println("-----------------------------");

					System.out.println("Product update successfully ");
					System.out.println("-----------------------------");

				} else {
					System.out.println("Faild!!!");

				}
				break;

			case "D":
				System.out.println("Enter the Product ID to be Deleted");
				Product pb3 = new Product();
				pb3.setId(sc.nextInt());
				ProductMangementDAO scrud3 = new ProductMangementDAO();
				int rows3 = ProductMangementDAO.delete(pb3);
				if (rows3 > 0) {
					System.out.println("Product deleted successfully ");
				} else {
					System.out.println("-----------------------------");

					System.out.println("Product Not found!!!");
					System.out.println("-----------------------------");

				}
				break;
			case "E":
				System.out.println("-----------------------------");

				System.out.println("Enter the Product ID to be Searched");
				System.out.println("-----------------------------");

				Product pb4 = new Product();
				pb4.setId(sc.nextInt());
				ProductMangementDAO scrud4 = new ProductMangementDAO();
				int rows4s = ProductMangementDAO.search(pb4);
				System.out.println("Product found!!!");
				break;
			case "F":
				System.out.println("*******************Thank You!!********************");
				System.exit(0);
				break;
			default:
				System.out.println(" Please enter valid Choice !!!!!!!! ");
			}

		}

	}
}




