package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService {
	
	private ProductDao productdao;
	private LoggerService loggerService;
	
	public ProductManager(ProductDao productdao,LoggerService loggerService) { //Artik HiberNate bagli degiliz,istedgimiz paketi buraya injecte edebiliriz.
		super();
		this.productdao = productdao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		//Is kodlari,kurallar yazilir
		if(product.getCategoryId() == 1) {
			System.out.println("Bu Kategoride Urun kabul edilmiyor");
			return;
		}
		this.productdao.add(product);
		this.loggerService.logToSystem("Urun eklendi" + product.getName());
			
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
