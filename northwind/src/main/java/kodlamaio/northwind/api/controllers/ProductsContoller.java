package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.entities.concretes.Product;

@RestController //Sen  bir controllersin
@RequestMapping("/api/products") //buraya bir istek gelirse bu class bu contoller'i karsiliyacak...
public class ProductsContoller { //Controller backend ve frontend'in birbiri ile haberlesmesini saglar.
		
		@Autowired //Projeyi tarayip productService varsa onu bulup newliyor.. IOC ile kullaniliyor.
		private ProductService productService; 
		public ProductsContoller(ProductService productService) {
			super();
			this.productService = productService;
		}
		@GetMapping("/getall")
		public List<Product> getAll(){
			return this.productService.getAll();
		}//kodlama.io/api/products/getall diye istek gelirse bu calisacak.
}

//kodlama.io/api/products