package validation.example.forms.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import validation.example.forms.entities.Product;
import validation.example.forms.repositories.ProductRepository;
import validation.example.forms.services.IServiceProduct;
import validation.example.forms.utils.CustomObjectResponse;

@CrossOrigin(origins = "*")
@RestController
public class ProductController {

	@Autowired
	private IServiceProduct productService;
	@Autowired
	private ProductRepository productr;
	
    @PostMapping(value="/addProduct", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<Object> addProduct(@Valid @RequestBody Product product){
    	productService.addProduct(product);
        return new ResponseEntity<Object>(new CustomObjectResponse("Creation done"), HttpStatus.OK);
    }
    @GetMapping(value="/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<List<Product>> agetroduct(){
    	return new ResponseEntity<List<Product>>(productr.findAll(), HttpStatus.OK);
    }
}
