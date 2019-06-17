package com.app.runner;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;
@Component
public class ProductConsoleRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;
	
	public void run(String... args) throws Exception {
		repo.save(new Product(71,"A","A1","A2",8.1));
		repo.save(new Product(72,"B","B1","B2",8.2));
		repo.save(new Product(73,"C","C1","C2",8.3));
		repo.save(new Product(74,"D","D1","D2",8.4));
		
		repo.save(new Product(75,"A","A1","A2",8.1));
		repo.save(new Product(76,"B","B1","B2",8.2));
		repo.save(new Product(77,"C","C1","C2",8.3));
		repo.save(new Product(78,"D","D1","D2",8.4));
		
		
		Product p=repo.getData(72);
		System.out.println(p.getProdCode());
		Optional<Product> p1=repo.getInfo(76);
		
		if(p.isPresent())
		{
			Product prd=p.get();
			System.out.println(prd.getProdCode());
		}else
		{
			System.out.println("NO DATA FOUNDs");
		}
		
		
	}

}
