package hello.Model;

import org.springframework.data.repository.CrudRepository;

public interface ShopRepository extends CrudRepository<Shop, Long> {

    Iterable<Shop> findById (Long id);
}

