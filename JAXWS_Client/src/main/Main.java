package main;

import ws.*;

public class Main {

	public static void main(String[] args) {

		try {
			
			ProductWSImplService productImplService = new ProductWSImplServiceLocator();
			ProductWS productWS = productImplService.getProductWSImplPort();
			
			//System.out.println("Id: " + productWS.find().getId());
			//System.out.println("Name: " + productWS.find().getName());
			//System.out.println("Price: " + productWS.find().getPrice());
			Product []listProduct = productWS.findAll();
			for(Product p: listProduct) {
				
				System.out.println("Id: " + p.getId());
				System.out.println("Name: " + p.getName());
				System.out.println("Price: " + p.getPrice());
				
				System.out.println("___________________________________");
			}
			
			
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

	}

}
