package hello.Model;

import org.hibernate.annotations.NamedQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Imanali on 12/7/13.
 */
public interface ProductsInShopRepository extends CrudRepository<ProductsInShop,Long>{
    @Query(value = "select pis from ProductsInShop pis where pis.shop.id = ?1")
    Iterable<ProductsInShop> findByShop(long shop);
}
