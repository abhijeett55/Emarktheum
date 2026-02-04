package services;


import java.util.List;

import entities.category;

public interface categoryService {
    List<category> getALLCategories(String catId);
}