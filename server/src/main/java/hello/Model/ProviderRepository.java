package hello.Model;

import org.springframework.data.repository.CrudRepository;

public interface ProviderRepository extends CrudRepository<Provider, Long> {

    Iterable<Provider> findById (Long id);
}

