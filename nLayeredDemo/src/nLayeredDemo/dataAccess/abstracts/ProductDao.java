package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao {

	void add(Product product);
	void update(Product product);
	void delete(Product product);
	Product get(int id);//bize product dondurecek..
	List<Product> getAll();//Urun listesi dondurebilir.. Product nesnesi olarak..
}
