package repositories;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import entities.product;

@Repository
public interface productRepository extends MongoRepository<product, String> {
    @Query(value = "some shit")
    List<product> findProductByUser(@Param("user") Collection<String> user);
    
}