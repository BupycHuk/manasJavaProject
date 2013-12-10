package hello.Model;


import org.springframework.data.repository.CrudRepository;
/**
 * Created by Admin on 10.12.13.
 */
public interface ProviderRepository extends CrudRepository<Provider, Long>    {

    Provider findByName(String name);
}
