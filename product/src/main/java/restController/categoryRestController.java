 package restController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entities.category;
import repositories.categoryRepository;
import request.productRequest;
import services.categoryService;
import lombok.RequiredArgsConstructor;

@RequestMapping("/product/category")

@RestController
@CrossOrigin(origins = "http//localhost:4200")
public class categoryRestController {

    @Autowired
    public categoryService categoryService;

    @Autowired
    public categoryRepository categoryRepository;

    @GetMapping("/getAll")
    public List<category> listCategory() {
        return (categoryService.getALLCategories() );
    }

    @GetMapping("/get/{id}")
    public category getCategory(@PathVariable("id") String id) {
        return (categoryService.getCategory(id));
    }

    @PostMapping("/create")
    public String addCategory(String label) {
        category c = new category(label);
        categoryRepository.save(c);
        return "Category Registered successfully!";
    }

    @PostMapping("/update/{id}")
    public category updateCategory(@PathVariable("id") String id, String label) {
        category c = categoryRepository.findById(id).get();
        c.setLabel(label);
        categoryRepository.save(c);
        System.out.println("Category updates successfully");
        return c;
    }


    @PostMapping("/delete/{id}")
    public String deleteCategory(@PathVariable("id") String id) {
        category c = categoryRepository.findById(id).get();
        categoryRepository.delete(c);
        return "Category Deleted successfully!";
    }
}