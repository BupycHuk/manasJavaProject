package hello.Model;

import org.springframework.data.repository.CrudRepository;

public interface ProductsInShopRepository extends CrudRepository<ProductsInShop, Long> {

    Shop findByProduct(String product);
    Shop findByCount(Integer count);
}

