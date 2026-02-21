package services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import entities.category;
import repositories.categoryRepository;

@Service
public class categoryServiceImpl implements categoryService {
    @Autowired
    private categoryRepository catRepos;

    @Override
    public List<category> getALLCategories() {
        return catRepos.findAll();
    }

    @Override
    public category getCategory(String catId) {
        return catRepos.findById(catId).get();
    } 
}
