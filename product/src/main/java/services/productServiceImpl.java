package services;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import entities.product;

@Service
public class productServiceImpl implements productService {



    @Override
    public List<product> getSoldProduct() {
        return productRepositories.findBySold(true);
    }

}