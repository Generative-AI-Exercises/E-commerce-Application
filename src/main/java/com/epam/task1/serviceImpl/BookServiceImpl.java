package com.epam.task1.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.epam.task1.entities.Product;
import com.epam.task1.exceptions.ResourceNotFoundException;
import com.epam.task1.repositories.ProductRepository;
import com.epam.task1.services.ProductService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements ProductService{

	private final ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
      return productRepository.findAll();
    }

	@Override
	public Product getProductById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product createProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product updateProduct(Long id, Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(Long id) {
		// TODO Auto-generated method stub
		
	}
	
    // methods for adding, removing, updating and fetching books

}
