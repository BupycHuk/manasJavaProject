package hello.Model;

import org.springframework.data.repository.CrudRepository;

public interface ForSellerRepository extends CrudRepository<ForSeller, Long> {
    Iterable<ForSeller> findByFullName(String fullName);
//    Iterable<ForSeller> findByLogin(String login);
//    Iterable<ForSeller> findById(Long id);
//    Iterable<ForSeller> findByPossword(String possword);
}

