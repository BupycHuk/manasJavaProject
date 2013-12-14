package hello.Model;

import org.springframework.data.repository.CrudRepository;

public interface ProductsInShopRepository extends CrudRepository<ProductsInShop, Long> {

    Iterable<ProductsInShop> findById (Long id);
}

