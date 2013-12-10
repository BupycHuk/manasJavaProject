package hello.Model;


import org.springframework.data.repository.CrudRepository;
/**
 * Created by Admin on 10.12.13.
 */
public interface ProductRepository extends CrudRepository<Product, Long>{
    Product findByNameProduct(String nameProduct);

}
