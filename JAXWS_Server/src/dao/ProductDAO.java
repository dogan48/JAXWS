package dao;

import entities.*;
import java.util.*;

public class ProductDAO {
	
	public Product find() {
		return new Product("P01", "name 1", 100);
	}
	
	public List<Product> findAll(){
		List<Product> result = new ArrayList<Product>();
		
		result.add(new Product("P01", "bread", 100));
		result.add(new Product("P02", "cheese", 200));
		result.add(new Product("P03", "chocolate", 300));
		
		return result;
		
	}

}
