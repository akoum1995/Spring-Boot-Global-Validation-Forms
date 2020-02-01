package validation.example.forms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import validation.example.forms.entities.Product;
import validation.example.forms.repositories.ProductRepository;
@Service(value = "productService")

public class ServiceProductIMPL implements IServiceProduct {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void addProduct(Product p) {
		productRepository.save(p);
	}

}
