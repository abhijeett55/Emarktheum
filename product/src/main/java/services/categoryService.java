package services;


import java.util.List;

import entities.category;

public interface categoryService {
    List<category> getALLCategories();
    category getCategory(String catId);
}