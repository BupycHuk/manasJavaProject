package hello.Model;


import org.springframework.data.repository.CrudRepository;
/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 10.12.13
 * Time: 15:32
 * To change this template use File | Settings | File Templates.
 */
public interface ProviderRepository extends CrudRepository<Provider, Long>{
    Provider findByName(String name);
}
