package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer>{//Product primary key'e gore impor eder..
	//Urun ile ilgili CRUD Operasyonlari hazir...
	//Entity Framework base reposityor olarak davranir JPARepository .. operasyonlar yazilmis onceden.. primary'e keye dikkat ediyoruz.
	

}
