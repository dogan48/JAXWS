package ws;

import dao.*;
import entities.*;
import java.util.*;
import javax.jws.*;

@WebService(endpointInterface="ws.ProductWS")
public class ProductWSImpl implements ProductWS{
	
	private ProductDAO productDAO = new ProductDAO();

	@Override
	public Product find() {
		return productDAO.find();
	}

	@Override
	public List<Product> findAll() {
		return productDAO.findAll();
	}

	
}
