package validation.example.forms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import validation.example.forms.entities.Product;


public interface ProductRepository  extends JpaRepository<Product, Integer>{

}
