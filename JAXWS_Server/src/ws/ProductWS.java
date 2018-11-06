package ws;

import entities.*;
import javax.jws.*;
import java.util.*;

@WebService
public interface ProductWS {

	@WebMethod
	public Product find();
	
	@WebMethod
	public List<Product> findAll();
}
