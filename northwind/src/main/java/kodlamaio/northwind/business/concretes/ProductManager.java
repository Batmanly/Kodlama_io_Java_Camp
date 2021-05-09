package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;

@Service //Bu class projede Servis gorevi gorecek diye springe bilgi veriyoruz..
public class ProductManager implements ProductService {

	private ProductDao productDao;
	@Autowired //Spring gidip arka planda buna karsi gelen bir tane sinif uretir ProductDao bunu direk private ustunede yazsak injection yapar.
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}
	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return this.productDao.findAll();//Butun Datalari getirir...
	}

}
