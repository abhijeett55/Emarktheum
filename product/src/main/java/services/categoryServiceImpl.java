package services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import entities.category;
import repositories.categoryRepository;

@Service
public class categoryServiceImpl implements categoryRepository {
    @Autowired
    private categoryRepository catRepos;

    @Override
    public List<category> getAllCategories() {
        return catRepos.findAll();
    }
}
