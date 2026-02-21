package repositories;

import java.util.Collection;
import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import entities.product;

@Repository
public interface productRepository extends MongoRepository<product, String> {
    @Query(value = "SELECT u FROM product u WHERE u .userId IN :user")
    List<product> findProductByUser(@Param("user") Collection<String> user);
    
    List<product> findAllByUserId(String id);
    @Query("{'verified' : true}")
    List<product> findByVerified(Boolean verified);

    @Query("{'sold' : true}")
    List<product> findBySold(Boolean sold);
}