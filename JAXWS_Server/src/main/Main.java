package main;


import javax.xml.ws.Endpoint;
import ws.*;

import ws.ProductWSImpl;

public class Main {

	public static void main(String[] args) {

		try {
			
			Endpoint.publish("http://localhost:4785/ws/product",new ProductWSImpl());
			System.out.println("Done!");
			
		} catch (Exception e) {

			System.out.println(e.getMessage());
		
		}

	}

}
